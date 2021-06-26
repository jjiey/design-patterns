package com.design.pattern.observer.demo6;

/**
 * @author yangsanity
 */
public class BClass {

    public void process(ICallback callback) {
        //...
        try {
            callback.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //...
    }
}
