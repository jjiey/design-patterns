package com.design.pattern.chainofresposibility.demo8;

import com.design.pattern.chainofresposibility.demo7.Content;

/**
 * @author yangsanity
 */
public interface SensitiveWordFilter {

    void doFilter(Content content);
}
