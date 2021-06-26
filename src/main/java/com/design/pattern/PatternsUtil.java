package com.design.pattern;

/**
 * 工具类
 * @author yj
 */
public class PatternsUtil {

    public static void throwException(String message) {
        try {
            throw new Exception(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
