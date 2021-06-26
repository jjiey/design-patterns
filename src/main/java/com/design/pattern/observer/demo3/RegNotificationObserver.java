package com.design.pattern.observer.demo3;

import com.design.pattern.observer.demo3.ClassUtil.NotificationService;

/**
 * @author yangsanity
 *
 * note：Spring 环境，notificationService 为依赖注入
 */
public class RegNotificationObserver implements RegObserver {

    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        // 发送站内信
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
