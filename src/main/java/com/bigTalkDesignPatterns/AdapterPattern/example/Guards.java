package com.bigTalkDesignPatterns.AdapterPattern.example;

/**
 * 后卫
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("后卫%s进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("后卫%s防守", name));
    }

}
