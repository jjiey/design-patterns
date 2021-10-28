package com.design.pattern.factory.factorymethod.demo2.v1;

import com.design.pattern.factory.factorymethod.demo2.parserfactory.IRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.JsonRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.PropertiesRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.XmlRuleConfigParserFactory;
import com.design.pattern.factory.factorymethod.demo2.parserfactory.YamlRuleConfigParserFactory;
import com.design.pattern.factory.simplefactory.demo2.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.demo2.parser.InvalidRuleConfigException;
import com.design.pattern.factory.simplefactory.demo2.parser.RuleConfig;

/**
 * @author yangsanity
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        IRuleConfigParserFactory parserFactory;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new JsonRuleConfigParserFactory();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new XmlRuleConfigParserFactory();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new YamlRuleConfigParserFactory();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new PropertiesRuleConfigParserFactory();
        } else {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        // 从 ruleConfigFilePath 文件中读取配置文本到 configText 中
        return parser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        // 解析文件名获取扩展名，比如 rule.json 返回json
        return "json";
    }
}
