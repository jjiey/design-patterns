package com.design.pattern.state.demo3.v3;

import com.design.pattern.state.demo3.State;
import lombok.Setter;

/**
 * 状态模式
 *
 * @author yangsanity
 */
@Setter
public class MarioStateMachine3 {

    private int score;

    /**
     * 不再使用枚举来表示状态
     */
    private IMario currentState;

    public MarioStateMachine3() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom();
    }

    public void obtainCape() {
        this.currentState.obtainCape();
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }

    public void meetMonster() {
        this.currentState.meetMonster();
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState.getName();
    }
}
