package com.design.pattern.factory.factorymethod.demo2.parserfactory;

import com.design.pattern.factory.simplefactory.demo2.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.JsonRuleConfigParser;

/**
 * @author yangsanity
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
