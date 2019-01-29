package com.bigTalkDesignPatterns.StatePattern.example;

/**
 * 中午工作状态
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间：%s点 饿了，午饭；犯困，午休。", work.getHour()));
        } else {
            work.setState(new AfternoonState()); // 超过13点，转入下午工作状态
            work.writeProgram();
        }
    }

}
