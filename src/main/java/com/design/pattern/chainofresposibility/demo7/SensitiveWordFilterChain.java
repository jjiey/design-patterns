package com.design.pattern.chainofresposibility.demo7;

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
    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}
