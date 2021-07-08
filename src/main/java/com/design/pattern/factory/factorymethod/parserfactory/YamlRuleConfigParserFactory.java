package com.design.pattern.factory.factorymethod.parserfactory;

import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.YamlRuleConfigParser;

/**
 * @author yangsanity
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
