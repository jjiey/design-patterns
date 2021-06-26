package com.design.pattern.state.demo3.v4;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 */
public interface IMario {

    /**
     * 获取当前状态
     */
    State getName();

    /* 以下是定义的事件 */

    /**
     * 吃到蘑菇
     */
    default void obtainMushRoom(MarioStateMachine4 stateMachine) {}

    /**
     * 获得斗篷
     */
    default void obtainCape(MarioStateMachine4 stateMachine) {}

    /**
     * 吃到火焰花
     */
    default void obtainFireFlower(MarioStateMachine4 stateMachine) {}

    /**
     * 被怪物碰到
     */
    default void meetMonster(MarioStateMachine4 stateMachine) {}
}
