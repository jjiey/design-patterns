package com.design.pattern.observer.demo5;

import java.util.concurrent.Executor;

/**
 * 异步非阻塞的观察者模式
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
