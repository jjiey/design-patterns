package com.design.pattern.state.demo3.v4;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 *
 * obtainMushRoom: do nothing...
 * obtainCape: do nothing...
 * obtainFireFlower: do nothing...
 */
public class CapeMario implements IMario {

    private static final CapeMario INSTANCE = new CapeMario();

    public static CapeMario getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void meetMonster(MarioStateMachine4 stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
