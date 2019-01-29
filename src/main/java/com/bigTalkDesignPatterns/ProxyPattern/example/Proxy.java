package com.bigTalkDesignPatterns.ProxyPattern.example;

import lombok.AllArgsConstructor;

/**
 * 代理追求者
 */
@AllArgsConstructor
public class Proxy implements GiveGift {

    Pursuit pursuit;

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }

}
