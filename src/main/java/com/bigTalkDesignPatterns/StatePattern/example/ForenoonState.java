package com.bigTalkDesignPatterns.StatePattern.example;

/**
 * 上午工作状态
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format("当前时间：%s点 上午工作，精神百倍。", work.getHour()));
        } else {
            work.setState(new NoonState()); // 超过12点，转入中午工作状态
            work.writeProgram();
        }
    }

}
