package com.design.pattern.state.demo3.v4;

import com.design.pattern.state.demo3.State;
import lombok.Setter;

/**
 * @author yangsanity
 */
@Setter
public class MarioStateMachine4 {

    private int score;

    private IMario currentState;

    public MarioStateMachine4() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom(this);
    }

    public void obtainCape() {
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster() {
        this.currentState.meetMonster(this);
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState.getName();
    }
}
