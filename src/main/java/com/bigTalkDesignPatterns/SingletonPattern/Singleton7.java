package com.bigTalkDesignPatterns.SingletonPattern;

/**
 * 枚举模式：最安全
 * 相比于懒汉模式在安全性方面更容易保证，相比于饿汉模式在实际调用的时候才会做最开始的初始化，而在后续使用的时候也可以直接取到里面的值，不会造成资源的浪费
 *
 * 线程安全 推荐
 */
public class Singleton7 {

    private Singleton7() {
    }

    public static Singleton7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    // 私有枚举类
    private enum Singleton {
        INSTANCE;

        private Singleton7 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new Singleton7();
        }

        public Singleton7 getInstance() {
            return singleton;
        }
    }
}
