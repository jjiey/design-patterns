package com.design.pattern.currentlimiting.v2.rule.parser;

import com.design.pattern.currentlimiting.v2.rule.RuleConfig;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yangsanity
 */
public class YamlRuleConfigParser implements RuleConfigParser {

    private static final Logger log = LoggerFactory.getLogger(YamlRuleConfigParser.class);

    @Override
    public RuleConfig parse(String configText) {
        InputStream in = null;
        try {
            in = this.getClass().getResourceAsStream(configText);
            return parse(in);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    log.error("close file error:{}", e);
                }
            }
        }
    }

    @Override
    public RuleConfig parse(InputStream in) {
        return in == null ? null : new Yaml().loadAs(in, RuleConfig.class);
    }
}
