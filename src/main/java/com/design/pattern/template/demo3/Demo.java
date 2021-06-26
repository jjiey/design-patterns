package com.design.pattern.template.demo3;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        BClass b = new BClass();
        // 回调对象
        b.process(() -> System.out.println("Call back me."));
    }
}
