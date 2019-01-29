package com.bigTalkDesignPatterns.StatePattern.example;

import lombok.Getter;
import lombok.Setter;

/**
 * 工作
 */
@Setter
@Getter
public class Work {

    private State state;

    private double hour; // 钟点，状态转换依据

    private boolean finish; // 任务是否完成，是否能下班依据

    public Work() {
        state = new ForenoonState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }

}
