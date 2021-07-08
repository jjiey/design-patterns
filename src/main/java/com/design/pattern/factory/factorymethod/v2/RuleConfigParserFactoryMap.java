package com.design.pattern.factory.factorymethod.v2;

import com.design.pattern.factory.factorymethod.parserfactory.IRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.parserfactory.JsonRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.parserfactory.PropertiesRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.parserfactory.XmlRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.parserfactory.YamlRuleConfigParserFactory;

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
