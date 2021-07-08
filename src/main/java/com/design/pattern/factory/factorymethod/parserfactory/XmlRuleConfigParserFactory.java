package com.design.pattern.factory.factorymethod.parserfactory;

import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.XmlRuleConfigParser;

/**
 * @author yangsanity
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
