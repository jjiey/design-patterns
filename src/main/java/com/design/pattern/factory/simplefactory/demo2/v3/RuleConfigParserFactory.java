package com.design.pattern.factory.simplefactory.demo2.v3;

import com.design.pattern.factory.simplefactory.demo2.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.JsonRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.PropertiesRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.XmlRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.YamlRuleConfigParser;

/**
 * @author yangsanity
 */
public class RuleConfigParserFactory {

    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
