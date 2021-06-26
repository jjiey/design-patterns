package com.design.pattern.state.demo2;

/**
 * 中午工作状态
 */
public class NoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间：%s点 饿了，午饭；犯困，午休。", work.getHour()));
        } else {
            // 超过13点，转入下午工作状态
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
