package com.design.pattern.state.demo2;

import lombok.Getter;
import lombok.Setter;

/**
 * 工作
 *
 * 状态机
 */
@Setter
@Getter
public class Work {

    private State state;

    /**
     * 钟点，状态转换依据
     */
    private double hour;

    /**
     * 任务是否完成，是否能下班依据
     */
    private boolean finish;

    public Work() {
        state = new ForenoonState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }
}
