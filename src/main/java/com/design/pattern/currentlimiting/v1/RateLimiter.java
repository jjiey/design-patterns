package com.design.pattern.currentlimiting.v1;

import com.design.pattern.currentlimiting.exception.InternalErrorException;
import com.design.pattern.currentlimiting.v1.alg.RateLimitAlg;
import com.design.pattern.currentlimiting.v1.rule.ApiLimit;
import com.design.pattern.currentlimiting.v1.rule.RateLimitRule;
import com.design.pattern.currentlimiting.v1.rule.RuleConfig;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 用来串联整个限流流程：
 * 1.先读取限流规则配置文件，映射为内存中的 Java 对象（RuleConfig）
 * 2.将这个中间结构构建成一个支持快速查询的数据结构（RateLimitRule）
 * 3.除此之外，这个类还提供供用户直接使用的最顶层接口（limit() 接口）
 *
 * @author yangsanity
 */
public class RateLimiter {

    private static final Logger log = LoggerFactory.getLogger(RateLimiter.class);

    // 为每个 api 在内存中存储限流计数器
    private ConcurrentHashMap<String, RateLimitAlg> counters = new ConcurrentHashMap<>();

    private RateLimitRule rule;

    public RateLimiter() {
        // 将限流规则配置文件 ratelimiter-rule.yaml 中的内容读取到RuleConfig中
        InputStream in = null;
        RuleConfig ruleConfig = null;
        try {
            in = this.getClass().getResourceAsStream("/ratelimiter-rule.yaml");
            if (in != null) {
                Yaml yaml = new Yaml();
                ruleConfig = yaml.loadAs(in, RuleConfig.class);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    log.error("close file error:{}", e);
                }
            }
        }

        // 将限流规则构建成支持快速查找的数据结构 RateLimitRule
        this.rule = new RateLimitRule(ruleConfig);
    }

    public boolean limit(String appId, String url) throws InternalErrorException {
        ApiLimit apiLimit = rule.getLimit(appId, url);
        if (apiLimit == null) {
            return true;
        }

        // 获取api对应在内存中的限流计数器（rateLimitCounter）
        String counterKey = appId + ":" + apiLimit.getApi();
        RateLimitAlg rateLimitCounter = counters.get(counterKey);
        if (rateLimitCounter == null) {
            RateLimitAlg newRateLimitCounter = new RateLimitAlg(apiLimit.getLimit());
            rateLimitCounter = counters.putIfAbsent(counterKey, newRateLimitCounter);
            if (rateLimitCounter == null) {
                rateLimitCounter = newRateLimitCounter;
            }
        }

        // 判断是否限流
        return rateLimitCounter.tryAcquire();
    }
}
