package com.design.pattern.chainofresposibility.demo8;

import com.design.pattern.chainofresposibility.demo7.Content;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsanity
 */
public class SensitiveWordFilterChain {

    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    /**
     * return true if content doesn't contain sensitive words.
     */
    public Content filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            filter.doFilter(content);
        }
        return content;
    }
}
