package com.bigTalkDesignPatterns.SingletonPattern;

import java.lang.reflect.Constructor;

/**
 * 饿汉模式
 * 单例实例在类加载时进行创建
 * 写静态域和静态方法一定要注意顺序，不同的静态代码块是按照顺序执行的，和正常定义的静态方法以及普通方法的执行顺序是不一致的
 *
 * 线程安全
 */
public class Singleton6 {

    // 单例对象，这句要写在static块前边，不然会报空指针异常
    private static Singleton6 instance = null;

    static {
        instance = new Singleton6();
    }

    private Singleton6() {
        /**
         * 如果不做这个判断，就可以通过反射修改private构造函数为public，然后newInstance，如下：
         * Constructor constructor = Singleton6.class.getDeclaredConstructor();
         * constructor.setAccessible(true);
         * Singleton6 singleton6 = (Singleton6) constructor.newInstance();
         */
        if (instance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static Singleton6 getInstance() {
        return instance;
    }

}
