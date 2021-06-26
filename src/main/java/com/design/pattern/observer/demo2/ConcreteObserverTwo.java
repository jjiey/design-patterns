package com.design.pattern.observer.demo2;

/**
 * @author yangsanity
 */
public class ConcreteObserverTwo implements Observer {

    @Override
    public void update(Event event) {
        System.out.println("ConcreteObserverTwo is notified.");
    }
}
