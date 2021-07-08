package com.design.pattern.factory.simplefactory.v2;

import com.design.pattern.factory.simplefactory.parser.IRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.InvalidRuleConfigException;
import com.design.pattern.factory.simplefactory.parser.JsonRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.PropertiesRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.RuleConfig;
import com.design.pattern.factory.simplefactory.parser.XmlRuleConfigParser;
import com.design.pattern.factory.simplefactory.parser.YamlRuleConfigParser;

/**
 * @author yangsanity
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        // 从 ruleConfigFilePath 文件中读取配置文本到 configText 中
        return parser.parse(configText);
    }

    private String getFileExtension(String filePath) {
        // 解析文件名获取扩展名，比如 rule.json 返回json
        return "json";
    }

    private IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
