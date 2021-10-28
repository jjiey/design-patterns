package com.design.pattern.factory.factorymethod.demo2.parserfactory;

import com.design.pattern.factory.simplefactory.demo2.parser.IRuleConfigParser;

/**
 * @author yangsanity
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
