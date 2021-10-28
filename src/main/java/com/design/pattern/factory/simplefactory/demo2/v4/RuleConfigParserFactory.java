package com.design.pattern.factory.simplefactory.demo2.v4;

import com.design.pattern.factory.simplefactory.demo2.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.JsonRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.PropertiesRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.XmlRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> CACHED_PARSERS = new HashMap<>();

    static {
        CACHED_PARSERS.put("json", new JsonRuleConfigParser());
        CACHED_PARSERS.put("xml", new XmlRuleConfigParser());
        CACHED_PARSERS.put("yaml", new YamlRuleConfigParser());
        CACHED_PARSERS.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            // return null or throw IllegalArgumentException
            return null;
        }
        return CACHED_PARSERS.get(configFormat.toLowerCase());
    }
}
