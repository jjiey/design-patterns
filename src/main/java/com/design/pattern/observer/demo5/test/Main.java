package com.design.pattern.observer.demo5.test;

import com.design.pattern.observer.demo5.AsyncEventBus;
import com.design.pattern.observer.demo5.EventBus;

import java.util.concurrent.Executors;

/**
 * @author y
 */
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.sync();
    }

    private void sync() {
        EventBus eventBus = new EventBus();
        eventBus.register(new EventListener());
        eventBus.post(new Message("123"));
    }

    private void async() {
        AsyncEventBus eventBus = new AsyncEventBus(Executors.newSingleThreadExecutor());
        eventBus.register(new EventListener());
        eventBus.post(new Message("456"));
    }
}
