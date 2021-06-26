package com.design.pattern.observer.demo4;

import com.design.pattern.observer.demo3.ClassUtil.UserService;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author yangsanity
 * <p>
 * note：Spring 环境，userService 为依赖注入
 */
public class UserController {

    private UserService userService;

    private EventBus eventBus;

    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        // 同步阻塞模式
        // eventBus = new EventBus();
        // 异步非阻塞模式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码；省略 userService.register() 异常的 try-catch 代码
        // 注册
        long userId = userService.register(telephone, password);
        // 发放各种优惠等
        eventBus.post(userId);
        return userId;
    }
}
