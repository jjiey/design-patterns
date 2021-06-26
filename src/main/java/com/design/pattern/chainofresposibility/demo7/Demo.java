package com.design.pattern.chainofresposibility.demo7;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());

        boolean legal = filterChain.filter(new Content());
        if (!legal) {
            // 不发表
        } else {
            // 发表
        }
    }
}
