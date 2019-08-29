package com.bigTalkDesignPatterns.SingletonPattern;

/**
 * 懒汉模式 -> 双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 * 出现的问题要从CPU指令来说起，参见下方注释
 *
 * 线程不安全
 */
public class Singleton4 {

    private Singleton4() {
    }

    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // JVM和cpu优化，发生了指令重排（因为2和3本质上没有前后必要关系，因此可以发生指令重排）

    // 1、memory = allocate() 分配对象的内存空间
    // 3、instance = memory 设置instance指向刚分配的内存
    // 2、ctorInstance() 初始化对象

    // 当A执行到（instance = new Singleton4()）这行执行了指令的第3步，此时线程B执行到（if (instance == null)）发现instance有值，会直接return，但是实际上指令的第2步初始化对象还没有做，线程B拿到还没有做初始化对象的instance之后，一旦调用就会出现问题

    private static Singleton4 instance = null;

    public static Singleton4 getInstance() {
        if (instance == null) { // 双重检测机制        // B
            synchronized (Singleton4.class) { // 同步锁
                if (instance == null) {
                    instance = new Singleton4(); // A - 3
                }
            }
        }
        return instance;
    }
}
