package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.newparser.ISystemConfigParser;
import com.design.pattern.factory.abstractfactory.newparser.YamlSystemConfigParser;
import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.YamlRuleConfigParser;

/**
 * @author yangsanity
 */
public class YamlConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}
