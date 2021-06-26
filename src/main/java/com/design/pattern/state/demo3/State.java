package com.design.pattern.state.demo3;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yangsanity
 */
@Getter
@AllArgsConstructor
public enum State {

    /**
     * 小马里奥（Small Mario）
     */
    SMALL(0),
    /**
     * 超级马里奥（Super Mario）
     */
    SUPER(1),
    /**
     * 火焰马里奥（Fire Mario）
     */
    FIRE(2),
    /**
     * 斗篷马里奥（Cape Mario）
     */
    CAPE(3);

    private final int value;
}
