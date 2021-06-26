package com.design.pattern.observer.demo2;

/**
 * 主题 / 抽象通知者
 *
 * @author yangsanity
 */
public interface Subject {

    /**
     * 添加观察者
     *
     * or attach
     */
    void register(Observer observer);

    /**
     * 移除观察者
     *
     * or detach / unregister
     */
    void remove(Observer observer);

    /**
     * 通知
     *
     * or post
     */
    void notify(Event event);
}
