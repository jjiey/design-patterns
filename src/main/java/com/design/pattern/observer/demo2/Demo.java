package com.design.pattern.observer.demo2;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.register(new ConcreteObserverOne());
        subject.register(new ConcreteObserverTwo());
        subject.notify(new Event("123"));
    }
}
