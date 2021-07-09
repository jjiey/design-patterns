package com.design.pattern.currentlimiting.v1.rule;

import com.design.pattern.currentlimiting.v1.rule.RuleConfig.AppRuleConfig;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;

/**
 * @author yangsanity
 */
public class RateLimitRule {

    private final Trie<String, Trie<String, ApiLimit>> appIdTrie;

    public RateLimitRule(RuleConfig ruleConfig) {
        appIdTrie = new PatriciaTrie<>();
        for (AppRuleConfig config : ruleConfig.getConfigs()) {
            Trie<String, ApiLimit> apiTrie = new PatriciaTrie<>();
            for (ApiLimit limit : config.getLimits()) {
                apiTrie.put(limit.getApi(), limit);
            }
            appIdTrie.put(config.getAppId(), apiTrie);
        }
    }

    public ApiLimit getLimit(String appId, String api) {
        Trie<String, ApiLimit> children = appIdTrie.getOrDefault(appId, new PatriciaTrie<>());
        return children.isEmpty() ? null : children.get(api);
    }
}
