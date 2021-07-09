package com.design.pattern.currentlimiting.v2;

import com.design.pattern.currentlimiting.exception.InternalErrorException;
import com.design.pattern.currentlimiting.exception.InvalidUrlException;
import com.design.pattern.currentlimiting.v2.alg.FixedTimeWinRateLimitAlg;
import com.design.pattern.currentlimiting.v2.alg.RateLimitAlg;
import com.design.pattern.currentlimiting.v2.alg.RateLimitAlgFactory;
import com.design.pattern.currentlimiting.v2.rule.ApiLimit;
import com.design.pattern.currentlimiting.v2.rule.RateLimitRule;
import com.design.pattern.currentlimiting.v2.rule.RuleConfig;
import com.design.pattern.currentlimiting.v2.rule.TrieRateLimitRule;
import com.design.pattern.currentlimiting.v2.rule.datasource.FileRuleConfigSource;
import com.design.pattern.currentlimiting.v2.rule.datasource.RuleConfigSource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangsanity
 */
public class RateLimiter {

    /**
     * 为每个api在内存中存储限流计数器
     */
    private final Map<String, RateLimitAlg> counters = new ConcurrentHashMap<>();

    private final RateLimitRule rule;

    public RateLimiter() {
        // 调用 RuleConfigSource 类来实现配置加载
        RuleConfigSource configSource = new FileRuleConfigSource();
        RuleConfig ruleConfig = configSource.load();
        this.rule = new TrieRateLimitRule(ruleConfig);
    }

    public boolean limit(String appId, String url) throws InternalErrorException, InvalidUrlException {
        ApiLimit apiLimit = rule.getLimit(appId, url);
        if (apiLimit == null) {
            return true;
        }

        // 获取api对应在内存中的限流计数器（rateLimitCounter）
        String counterKey = appId + ":" + apiLimit.getApi();
        RateLimitAlg rateLimitCounter = counters.get(counterKey);
        if (rateLimitCounter == null) {
            RateLimitAlg newRateLimitCounter = RateLimitAlgFactory.getStrategy("fixedTimeWin", apiLimit);
            rateLimitCounter = counters.putIfAbsent(counterKey, newRateLimitCounter);
            if (rateLimitCounter == null) {
                rateLimitCounter = newRateLimitCounter;
            }
        }

        // 判断是否限流
        return rateLimitCounter.tryAcquire();
    }
}
