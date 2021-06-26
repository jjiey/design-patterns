package com.design.pattern.Proxy.example;

/**
 * 追求者
 */
public class Pursuit implements GiveGift {

    @Override
    public void giveDolls() {
        System.out.println(String.format("送你洋娃娃"));
    }

    @Override
    public void giveFlowers() {
        System.out.println(String.format("送你鲜花"));
    }

    @Override
    public void giveChocolate() {
        System.out.println(String.format("送你巧克力"));
    }

}
