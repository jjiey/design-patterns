package com.design.pattern.strategy.demo3;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 运行时动态确定，根据配置文件的配置决定使用哪种策略
 *
 * @author yangsanity
 */
public class RuntimeDynamicsApplication {

    public static void main(String[] args) throws Exception {
        EvictionStrategy evictionStrategy;
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("eviction_type");
        evictionStrategy = EvictionStrategyFactory.getEvictionStrategy(type);
        UserCache userCache = new UserCache(evictionStrategy);
        //...
    }
}
