package com.design.pattern.state.demo3.v2;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yangsanity
 */
@Getter
@AllArgsConstructor
public enum Event {

    /**
     * 吃蘑菇
     */
    GOT_MUSHROOM(0),
    /**
     * 获得斗篷
     */
    GOT_CAPE(1),
    /**
     * 吃火焰花
     */
    GOT_FIRE(2),
    /**
     * 被怪物碰到
     */
    MET_MONSTER(3);

    private final int value;
}
