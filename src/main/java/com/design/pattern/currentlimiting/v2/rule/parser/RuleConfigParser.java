package com.design.pattern.currentlimiting.v2.rule.parser;

import com.design.pattern.currentlimiting.v2.rule.RuleConfig;

import java.io.InputStream;

/**
 * @author yangsanity
 */
public interface RuleConfigParser {

    RuleConfig parse(String configText);

    RuleConfig parse(InputStream in);
}
