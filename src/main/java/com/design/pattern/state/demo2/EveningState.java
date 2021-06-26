package com.design.pattern.state.demo2;

/**
 * 晚间工作状态
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState()); // 完成任务，下班
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间：%s点 加班哦，疲累之极。", work.getHour()));
            } else {
                // 超过21点，转入睡眠状态
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
