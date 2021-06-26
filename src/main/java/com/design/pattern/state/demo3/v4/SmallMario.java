package com.design.pattern.state.demo3.v4;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 *
 * meetMonster: do nothing... actually Mario dead...
 */
public class SmallMario implements IMario {

    private static final SmallMario INSTANCE = new SmallMario();

    public static SmallMario getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine4 stateMachine) {
        stateMachine.setCurrentState(SuperMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape(MarioStateMachine4 stateMachine) {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 200);
    }

    @Override
    public void obtainFireFlower(MarioStateMachine4 stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 300);
    }
}
