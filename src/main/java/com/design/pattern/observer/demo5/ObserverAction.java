package com.design.pattern.observer.demo5;

import com.google.common.base.Preconditions;
import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 表示 @Subscribe 注解的方法。主要用在 {@link ObserverRegistry} 观察者注册表中。
 */
@Data
public class ObserverAction {

    /**
     * 观察者类
     */
    private Object target;

    /**
     * 方法
     */
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        this.method.setAccessible(true);
    }

    /**
     * @param event method方法的参数
     */
    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
