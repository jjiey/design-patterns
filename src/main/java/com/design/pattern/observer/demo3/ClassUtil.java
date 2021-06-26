package com.design.pattern.observer.demo3;

/**
 * @author yangsanity
 */
public class ClassUtil {

    public static class UserService {

        public long register(String telephone, String password) {
            System.out.println(telephone + " 注册成功");
            return 0L;
        }
    }

    public static class PromotionService {

        public void issueNewUserExperienceCash(long userId) {
            System.out.println("给" + userId + "发放投资体验金成功");
        }
    }

    public static class NotificationService {

        public void sendInboxMessage(long userId, String msg) {
            System.out.println("给" + userId + "发送站内信成功");
        }
    }
}
