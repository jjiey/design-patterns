package com.design.pattern.strategy.demo3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class UserCache {

    private Map<String, User> cacheData = new HashMap<>();

    private EvictionStrategy eviction;

    public UserCache(EvictionStrategy eviction) {
        this.eviction = eviction;
    }

    //...



    // ===== === ===== //

    static class User {

    }
}
