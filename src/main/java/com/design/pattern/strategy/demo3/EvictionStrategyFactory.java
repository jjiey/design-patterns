package com.design.pattern.strategy.demo3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class EvictionStrategyFactory {

    private EvictionStrategyFactory() {}

    private static final Map<String, EvictionStrategy> strategies = new HashMap<>();

    static {
        strategies.put("lru", new LruEvictionStrategy());
        strategies.put("fifo", new FifoEvictionStrategy());
        strategies.put("lfu", new LfuEvictionStrategy());
    }

    public static EvictionStrategy getEvictionStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
