package com.design.pattern.chainofresposibility.demo3;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
