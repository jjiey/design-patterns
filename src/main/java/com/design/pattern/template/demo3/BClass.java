package com.design.pattern.template.demo3;

/**
 * @author yangsanity
 */
public class BClass {

    public void process(ICallback callback) {
        //...
        callback.methodToCallback();
        //...
    }
}
