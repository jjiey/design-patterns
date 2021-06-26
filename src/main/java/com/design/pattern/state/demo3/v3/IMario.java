package com.design.pattern.state.demo3.v3;

import com.design.pattern.state.demo3.State;

/**
 * 所有状态类的接口
 *
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
    default void obtainMushRoom() {}

    /**
     * 获得斗篷
     */
    default void obtainCape() {}

    /**
     * 吃到火焰花
     */
    default void obtainFireFlower() {}

    /**
     * 被怪物碰到
     */
    default void meetMonster() {}
}
