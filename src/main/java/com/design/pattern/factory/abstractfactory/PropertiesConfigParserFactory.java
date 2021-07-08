package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.newparser.ISystemConfigParser;
import com.design.pattern.factory.abstractfactory.newparser.PropertiesSystemConfigParser;
import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.PropertiesRuleConfigParser;

/**
 * @author yangsanity
 */
public class PropertiesConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new PropertiesSystemConfigParser();
    }
}
