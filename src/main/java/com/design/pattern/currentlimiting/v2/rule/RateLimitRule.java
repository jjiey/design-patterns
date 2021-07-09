package com.design.pattern.currentlimiting.v2.rule;

/**
 * @author yangsanity
 */
public interface RateLimitRule {

    ApiLimit getLimit(String appId, String api);
}
