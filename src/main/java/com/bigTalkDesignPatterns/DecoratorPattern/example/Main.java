package com.bigTalkDesignPatterns.DecoratorPattern.example;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }

}
