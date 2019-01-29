package com.bigTalkDesignPatterns.ProxyPattern.example;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

    public static void main(String[] args) {
        Pursuit pursuit = new Pursuit();
        Proxy proxy = new Proxy(pursuit);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

}
