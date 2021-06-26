package com.design.pattern.chainofresposibility.demo2;

/**
 * @author yangsanity
 */
public class HandlerA extends Handler {

    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
