package com.design.pattern.factory.simplefactory.demo2.parser;

/**
 * @author yangsanity
 */
public class InvalidRuleConfigException extends RuntimeException {

    public InvalidRuleConfigException(String message){
        super(message);
    }

    public InvalidRuleConfigException(Throwable e){
        super(e);
    }

    public InvalidRuleConfigException(String message,Throwable e){
        super(message,e);
    }
}
