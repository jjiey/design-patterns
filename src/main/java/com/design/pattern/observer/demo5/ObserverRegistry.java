package com.design.pattern.observer.demo5;

import com.google.common.base.Preconditions;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Observer 注册表
 */
public class ObserverRegistry {

    /**
     * K -> event
     * V -> 匹配 event 的观察者集合
     */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<ObserverAction>> registry = new ConcurrentHashMap<>();

    /**
     * 注册观察者
     */
    public void register(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = findAllObserverActions(observer);
        for (Map.Entry<Class<?>, Collection<ObserverAction>> entry : observerActions.entrySet()) {
            // method 参数类型（event）
            Class<?> eventType = entry.getKey();
            // 观察者类和方法信息的集合
            Collection<ObserverAction> eventActions = entry.getValue();
            CopyOnWriteArraySet<ObserverAction> registeredEventActions = registry.getOrDefault(eventType, new CopyOnWriteArraySet<>());
            registeredEventActions.addAll(eventActions);
            registry.put(eventType, registeredEventActions);
        }
    }

    /**
     * k->method 参数类型   V->观察者类和方法信息的集合
     */
    private Map<Class<?>, Collection<ObserverAction>> findAllObserverActions(Object observer) {
        Map<Class<?>, Collection<ObserverAction>> observerActions = new HashMap<>();
        Class<?> clazz = observer.getClass();
        for (Method method : getAnnotatedMethods(clazz)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> eventType = parameterTypes[0];
            observerActions.computeIfAbsent(eventType, k -> new ArrayList<>());
            observerActions.get(eventType).add(new ObserverAction(observer, method));
        }
        return observerActions;
    }

    /**
     * 获取 clazz 中所有标注了 @Subscribe 且只有一个参数的方法
     */
    private List<Method> getAnnotatedMethods(Class<?> clazz) {
        List<Method> annotatedMethods = new ArrayList<>();
        for (Method method : clazz.getMethods()) {
            if (!Objects.equals(method.getDeclaringClass(), Object.class) && method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Preconditions.checkArgument(parameterTypes.length == 1,
                        "Method %s has @Subscribe annotation but has %s parameters."
                                + "Subscriber methods must have exactly 1 parameter.",
                        method, parameterTypes.length);
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

    /**
     * 获取所有匹配 event 的观察者集合
     */
    public List<ObserverAction> getMatchedObserverActions(Object event) {
        List<ObserverAction> matchedObservers = new ArrayList<>();
        Class<?> postedEventType = event.getClass();
        for (Map.Entry<Class<?>, CopyOnWriteArraySet<ObserverAction>> entry : registry.entrySet()) {
            // method 参数类型（event）
            Class<?> eventType = entry.getKey();
            // 观察者类和方法信息的集合
            Collection<ObserverAction> eventActions = entry.getValue();
            // 如果 eventType 是 postedEventType 的父类
            // 父类.class.isAssignableFrom(子类.class)
            if (eventType.isAssignableFrom(postedEventType)) {
                matchedObservers.addAll(eventActions);
            }
        }
        return matchedObservers;
    }
}
