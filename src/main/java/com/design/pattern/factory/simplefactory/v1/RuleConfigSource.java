package com.design.pattern.factory.simplefactory.v1;

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
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
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
}
