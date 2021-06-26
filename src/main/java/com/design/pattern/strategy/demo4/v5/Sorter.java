package com.design.pattern.strategy.demo4.v5;

import com.design.pattern.strategy.demo4.v2.ISortAlg;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsanity
 */
public class Sorter {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile(args[0]);
    }

    private static final long GB = 1000 * 1000 * 1000;

    private static final List<AlgRange> algs = new ArrayList<>();

    static {
        algs.add(new AlgRange(0, 6 * GB, SortAlgAnnoFactory.getSortAlg("QuickSort")));
        algs.add(new AlgRange(6 * GB, 10 * GB, SortAlgAnnoFactory.getSortAlg("ExternalSort")));
        algs.add(new AlgRange(10 * GB, 100 * GB, SortAlgAnnoFactory.getSortAlg("ConcurrentExternalSort")));
        algs.add(new AlgRange(100 * GB, Long.MAX_VALUE, SortAlgAnnoFactory.getSortAlg("MapReduceSort")));
    }

    public void sortFile(String filePath) {
        // 省略校验逻辑
        File file = new File(filePath);
        long fileSize = file.length();
        for (AlgRange algRange : algs) {
            if (algRange.inRange(fileSize)) {
                algRange.getAlg().sort(filePath);
                break;
            }
        }
    }

    private static class AlgRange {

        private final long start;

        private final long end;

        private final ISortAlg alg;

        public AlgRange(long start, long end, ISortAlg alg) {
            this.start = start;
            this.end = end;
            this.alg = alg;
        }

        public ISortAlg getAlg() {
            return alg;
        }

        public boolean inRange(long size) {
            return size >= start && size < end;
        }
    }
}
