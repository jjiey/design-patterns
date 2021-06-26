package com.design.pattern.state.demo3.v4;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 * <p>
 * obtainMushRoom: do nothing...
 */
public class SuperMario implements IMario {

    private static final SuperMario INSTANCE = new SuperMario();

    public static SuperMario getInstance() {
        return INSTANCE;
    }

    @Override
    public State getName() {
        return State.SUPER;
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

    @Override
    public void meetMonster(MarioStateMachine4 stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 100);
    }
}
