package com.design.pattern.observer.demo3;

import com.design.pattern.observer.demo3.ClassUtil.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsanity
 * <p>
 * note：Spring 环境，userService 和 regObservers 为依赖注入
 */
public class UserController {

    private UserService userService;

    private final List<RegObserver> regObservers = new ArrayList<>();

    // 一次性设置好，之后也不可能动态的修改
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码；省略 userService.register() 异常的 try-catch 代码
        // 注册
        long userId = userService.register(telephone, password);
        // 发放各种优惠等
        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
