package com.design.pattern.state.demo3.v3;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 *
 * obtainMushRoom: do nothing...
 * obtainCape: do nothing...
 * obtainFireFlower: do nothing...
 */
public class FireMario implements IMario {

    private final MarioStateMachine3 stateMachine;

    public FireMario(MarioStateMachine3 stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new SmallMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
