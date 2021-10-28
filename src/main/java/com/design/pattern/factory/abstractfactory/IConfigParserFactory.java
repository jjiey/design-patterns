package com.design.pattern.factory.abstractfactory;

import com.design.pattern.factory.abstractfactory.newparser.ISystemConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.IRuleConfigParser;

public interface IConfigParserFactory {

    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();

    //此处可以扩展新的parser类型，比如IBizConfigParser
}
