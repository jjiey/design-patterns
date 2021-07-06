package com.design.pattern.interpreter.demo3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 *
 * 运算符优先级：“> < ==” && ||
 */
public class Demo {

    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stats = new HashMap<>();
        // rule 中没有的 key 不作处理
        stats.put("api_error_per_minute", 103l);
        stats.put("api_count_per_minute", 987l);
        stats.put("key1", 101l);
        stats.put("key3", 121l);
        stats.put("key4", 88l);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }
}
