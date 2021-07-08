package com.design.pattern.factory.factorymethod.parserfactory;

import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.JsonRuleConfigParser;

/**
 * @author yangsanity
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
