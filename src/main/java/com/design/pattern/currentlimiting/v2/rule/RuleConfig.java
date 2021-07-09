package com.design.pattern.currentlimiting.v2.rule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author yangsanity
 */
@Getter
@Setter
public class RuleConfig {

    private List<AppRuleConfig> configs;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AppRuleConfig {

        private String appId;

        private List<ApiLimit> limits;
    }
}
