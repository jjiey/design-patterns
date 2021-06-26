package com.design.pattern.Adapter.example;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

    public static void main(String[] args) {
        Player m = new Guards("maidi");
        m.attack();
        Player y = new Translator("yaoming");
        y.attack();
        y.defense();
    }

}
