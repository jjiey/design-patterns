package com.bigTalkDesignPatterns.StatePattern.example;

/**
 * 下班休息状态
 */
public class RestState extends State {

    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点 下班回家了。", work.getHour()));
    }

}
