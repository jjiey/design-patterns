package com.design.pattern.strategy.demo4.v2;

import com.design.pattern.strategy.demo4.v5.SortAlgStrategy;

/**
 * @author yangsanity
 */
@SortAlgStrategy(sortName = "ConcurrentExternalSort")
public class ConcurrentExternalSort implements ISortAlg {

    @Override
    public void sort(String filePath) {
        //...
    }
}
