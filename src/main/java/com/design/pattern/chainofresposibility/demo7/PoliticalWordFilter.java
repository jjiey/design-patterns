package com.design.pattern.chainofresposibility.demo7;

/**
 * @author yangsanity
 */
public class PoliticalWordFilter implements SensitiveWordFilter {

    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        //...
        return legal;
    }
}
