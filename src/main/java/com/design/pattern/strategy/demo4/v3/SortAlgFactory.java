package com.design.pattern.strategy.demo4.v3;

import com.design.pattern.strategy.demo4.v2.ConcurrentExternalSort;
import com.design.pattern.strategy.demo4.v2.ExternalSort;
import com.design.pattern.strategy.demo4.v2.ISortAlg;
import com.design.pattern.strategy.demo4.v2.MapReduceSort;
import com.design.pattern.strategy.demo4.v2.QuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class SortAlgFactory {

    private SortAlgFactory() {}

    private static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}
