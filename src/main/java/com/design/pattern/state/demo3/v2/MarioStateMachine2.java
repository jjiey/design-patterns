package com.design.pattern.state.demo3.v2;

import com.design.pattern.state.demo3.State;
import lombok.Getter;

/**
 * 查表法
 * <p>
 * 第一维表示当前状态，第二维表示事件
 *
 * @author yangsanity
 */
@Getter
public class MarioStateMachine2 {

    private int score;

    private State currentState;

    /**
     * 二维表中的状态
     */
    private static final State[][] TRANSITION_TABLE = {
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.CAPE, State.CAPE, State.CAPE, State.SMALL},
            {State.FIRE, State.FIRE, State.FIRE, State.SMALL}
    };

    /**
     * 二维表中状态转移后的得分
     */
    private static final int[][] ACTION_TABLE = {
            {+100, +200, +300, +0},
            {+0, +200, +300, -100},
            {+0, +0, +0, -200},
            {+0, +0, +0, -300}
    };

    public MarioStateMachine2() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        // 当前状态经过事件之后，转移到的新状态
        this.currentState = TRANSITION_TABLE[stateValue][eventValue];
        // 当前状态经过事件之后，执行的动作
        this.score += ACTION_TABLE[stateValue][eventValue];
    }
}
