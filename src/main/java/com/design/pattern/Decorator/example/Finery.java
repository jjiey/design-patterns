package com.design.pattern.Decorator.example;

/**
 * Decorator
 */
public class Finery extends Person {

    protected Person component;

    // 打扮
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null) {
            component.show();
        }
    }

}
