package com.bigTalkDesignPatterns.AdapterPattern.example;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

    public static void main(String[] args) {
        Player b = new Forwards("badier");
        b.attack();
        Player m = new Guards("maidi");
        m.attack();
        Player y = new Translator("yaoming");
        y.attack();
        y.defense();
    }

}
