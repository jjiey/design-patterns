package com.design.pattern.state.demo2;

/**
 * 下午工作状态
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(String.format("当前时间：%s点 下午状态还不错，继续努力。", work.getHour()));
        } else {
            // 超过17点，转入傍晚工作状态
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
