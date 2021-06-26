package com.design.pattern.template.demo2;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
    }
}
