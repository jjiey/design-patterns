package com.bigTalkDesignPatterns.AdapterPattern.example;

/**
 * 前锋
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋%s进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋%s防守", name));
    }

}
