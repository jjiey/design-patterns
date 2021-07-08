package com.design.pattern.factory.factorymethod.parserfactory;

import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;

/**
 * @author yangsanity
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
