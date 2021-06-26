package com.design.pattern.state.demo3.v4;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 *
 * obtainMushRoom: do nothing...
 * obtainCape: do nothing...
 * obtainFireFlower: do nothing...
 */
public class FireMario implements IMario {

    private static final FireMario INSTANCE = new FireMario();

    public static FireMario getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void meetMonster(MarioStateMachine4 stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
