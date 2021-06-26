package com.design.pattern.observer.demo4;

import com.design.pattern.observer.demo3.ClassUtil.NotificationService;
import com.google.common.eventbus.Subscribe;

/**
 * @author yangsanity
 *
 * note：Spring 环境，notificationService 为依赖注入
 */
public class RegNotificationObserver {

    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}
