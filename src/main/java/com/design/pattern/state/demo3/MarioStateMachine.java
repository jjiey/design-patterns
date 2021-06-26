package com.design.pattern.state.demo3;

import lombok.Getter;

/**
 * @author yangsanity
 */
@Getter
public class MarioStateMachine {

    private int score;

    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    /**
     * 吃到蘑菇
     */
    public void obtainMushRoom() {
        //TODO
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        //TODO
    }

    /**
     * 吃到火焰花
     */
    public void obtainFireFlower() {
        //TODO
    }

    /**
     * 被怪物碰到
     */
    public void meetMonster() {
        //TODO
    }
}
