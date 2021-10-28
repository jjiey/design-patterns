package com.design.pattern.factory.factorymethod.demo2.v2;

import com.design.pattern.factory.factorymethod.demo2.parserfactory.IRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.JsonRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.PropertiesRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.XmlRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class RuleConfigParserFactoryMap {

    private static final Map<String, IRuleConfigParserFactory> CACHED_FACTORIES = new HashMap<>();

    static {
        CACHED_FACTORIES.put("json", new JsonRuleConfigParserFactory());
        CACHED_FACTORIES.put("xml", new XmlRuleConfigParserFactory());
        CACHED_FACTORIES.put("yaml", new YamlRuleConfigParserFactory());
        CACHED_FACTORIES.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return CACHED_FACTORIES.get(type.toLowerCase());
    }
}
