package com.design.pattern.factory.factorymethod.parserfactory;

import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.PropertiesRuleConfigParser;

/**
 * @author yangsanity
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
