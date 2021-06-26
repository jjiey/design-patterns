package com.design.pattern.strategy.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class StrategyFactory {

    private StrategyFactory() {}

    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    /**
     * 无状态的策略类工厂
     */
    public static Strategy getStatelessStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }

    /**
     * 有状态的策略类工厂
     *
     * 相当于把原来的 if-else 分支逻辑，从业务类中转移到了工厂类中，实际上并没有真正将它移除
     */
    public static Strategy getStatefulStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        if (type.equals("A")) {
            return new ConcreteStrategyA();
        } else if (type.equals("B")) {
            return new ConcreteStrategyB();
        }
        return null;
    }
}
