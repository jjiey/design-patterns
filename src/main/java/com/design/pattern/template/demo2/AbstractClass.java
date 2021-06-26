package com.design.pattern.template.demo2;

/**
 * @author yangsanity
 */
public abstract class AbstractClass {

    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();

    protected abstract void method2();
}
