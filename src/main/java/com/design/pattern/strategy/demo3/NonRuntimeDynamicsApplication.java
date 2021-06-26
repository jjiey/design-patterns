package com.design.pattern.strategy.demo3;

/**
 * 非运行时动态确定，在代码中指定使用哪种策略
 *
 * “非运行时动态确定”并不能发挥策略模式的优势。在这种应用场景下，策略模式实际上退化成了“面向对象的多态特性”或“基于接口而非实现编程原则”。
 *
 * @author yangsanity
 */
public class NonRuntimeDynamicsApplication {

    public static void main(String[] args) {
        //...
        EvictionStrategy evictionStrategy = new LruEvictionStrategy();
        UserCache userCache = new UserCache(evictionStrategy);
        //...
    }
}
