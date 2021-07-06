package com.design.pattern.interpreter.demo3;

import java.util.Map;

/**
 * @author yangsanity
 */
public interface Expression {

    /**
     * @return true 符合规则里的条件；false 不符合规则里的条件
     */
    boolean interpret(Map<String, Long> stats);
}
