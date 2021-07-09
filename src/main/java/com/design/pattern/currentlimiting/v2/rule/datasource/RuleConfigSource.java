package com.design.pattern.currentlimiting.v2.rule.datasource;

import com.design.pattern.currentlimiting.v2.rule.RuleConfig;

/**
 * @author yangsanity
 */
public interface RuleConfigSource {

    RuleConfig load();
}
