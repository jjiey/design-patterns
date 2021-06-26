package com.design.pattern.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsanity
 */
public class ConcreteSubject implements Subject {

    private final List<Observer> observers;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(Event event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
