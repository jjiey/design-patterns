package com.bigTalkDesignPatterns.SingletonPattern;

/**
 * 懒汉模式 -> 双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 *
 * 线程安全
 */
public class Singleton5 {

    private Singleton5() {
    }

    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // 单例对象 volatile + 双重检测机制 -> 禁止指令重排
    private volatile static Singleton5 instance = null;

    public static Singleton5 getInstance() {
        if (instance == null) { // 双重检测机制        // B
            synchronized (Singleton5.class) { // 同步锁
                if (instance == null) {
                    instance = new Singleton5(); // A - 3
                }
            }
        }
        return instance;
    }
}
