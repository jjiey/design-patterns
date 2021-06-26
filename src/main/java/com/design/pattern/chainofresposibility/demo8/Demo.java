package com.design.pattern.chainofresposibility.demo8;

import com.design.pattern.chainofresposibility.demo7.Content;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());

        Content content = filterChain.filter(new Content());
        // 发表
    }
}
