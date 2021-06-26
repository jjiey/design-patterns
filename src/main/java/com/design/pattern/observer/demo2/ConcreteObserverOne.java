package com.design.pattern.observer.demo2;

/**
 * @author yangsanity
 */
public class ConcreteObserverOne implements Observer {

    @Override
    public void update(Event event) {
        System.out.println("ConcreteObserverOne is notified.");
    }
}
