package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.newparser.ISystemConfigParser;
import com.design.pattern.factory.abstractfactory.newparser.JsonSystemConfigParser;
import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.JsonRuleConfigParser;

/**
 * @author yangsanity
 */
public class JsonConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
