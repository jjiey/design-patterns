package com.design.pattern.state.demo2;

/**
 * 睡眠状态
 */
public class SleepingState extends State {

    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点 不行了，睡着了。", work.getHour()));
    }
}
