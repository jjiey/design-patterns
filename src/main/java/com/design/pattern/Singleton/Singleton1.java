package com.design.pattern.Singleton;

/**
 * 懒汉模式
 * 单例实例在第一次使用时进行创建
 * 单线程模式下没问题，多线程环境下可能会有问题，问题出在（if (instance == null) ）行，可能会实例化多次，这样也是有影响的，因为我们无法避免如果在实例的时候私有构造函数要做很多操作，包括一些对资源的处理或者运算，这时如果运算两次就可能会出现错误
 *
 * 线程不安全
 */

public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 instance = null;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
