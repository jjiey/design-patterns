package com.bigTalkDesignPatterns.AdapterPattern.example;

import lombok.Getter;
import lombok.Setter;

/**
 * 外籍中锋
 */
@Getter
@Setter
public class ForeignCenter {

    private String name;

    public void jingong() {
        System.out.println(String.format("外籍中锋%s进攻", name));
    }

    public void fangshou() {
        System.out.println(String.format("外籍中锋%s防守", name));
    }

}
