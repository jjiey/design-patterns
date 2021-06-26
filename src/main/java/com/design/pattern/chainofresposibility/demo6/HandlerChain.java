package com.design.pattern.chainofresposibility.demo6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsanity
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            handler.handle();
        }
    }
}
