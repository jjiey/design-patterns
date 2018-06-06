package com.bigTalkDesignPatterns;

/**
 * 一些工具类
 *
 * @author yj
 *
 */
public class PatternsUtil {

    public static void throwException(String exceptionMessage) {
        try {
            throw new Exception(exceptionMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
