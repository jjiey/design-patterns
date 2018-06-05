package com.bigTalkDesignPatterns;

public class PatternsUtil {

    public static void throwException(String exceptionMessage) {
        try {
            throw new Exception(exceptionMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
