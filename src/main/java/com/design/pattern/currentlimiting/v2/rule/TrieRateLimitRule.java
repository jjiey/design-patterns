package com.design.pattern.currentlimiting.v2.rule;

import com.design.pattern.currentlimiting.v2.rule.RuleConfig.AppRuleConfig;
import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;

/**
 * @author yangsanity
 */
public class TrieRateLimitRule implements RateLimitRule {

    private final Trie<String, Trie<String, ApiLimit>> appIdTrie;

    public TrieRateLimitRule(RuleConfig ruleConfig) {
        appIdTrie = new PatriciaTrie<>();
        for (AppRuleConfig config : ruleConfig.getConfigs()) {
            Trie<String, ApiLimit> apiTrie = new PatriciaTrie<>();
            for (ApiLimit limit : config.getLimits()) {
                apiTrie.put(limit.getApi(), limit);
            }
            appIdTrie.put(config.getAppId(), apiTrie);
        }
    }

    @Override
    public ApiLimit getLimit(String appId, String api) {
        Trie<String, ApiLimit> children = appIdTrie.getOrDefault(appId, new PatriciaTrie<>());
        return children.isEmpty() ? null : children.get(api);
    }
}
