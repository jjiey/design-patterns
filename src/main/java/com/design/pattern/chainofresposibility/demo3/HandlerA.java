package com.design.pattern.chainofresposibility.demo3;

/**
 * @author yangsanity
 */
public class HandlerA extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;
        //...
        return handled;
    }
}
