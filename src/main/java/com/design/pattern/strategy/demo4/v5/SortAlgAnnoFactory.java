package com.design.pattern.strategy.demo4.v5;

import com.design.pattern.strategy.demo4.v2.ISortAlg;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangsanity
 */
public class SortAlgAnnoFactory {

    private SortAlgAnnoFactory() {}

    private static final Map<String, ISortAlg> algs = new HashMap<>();

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return getAnnotatedSortAlg().get(type);
    }

    private static Map<String, ISortAlg> getAnnotatedSortAlg() {
        if (!algs.isEmpty()) {
            return algs;
        }
        synchronized (SortAlgAnnoFactory.class) {
            if (!algs.isEmpty()) {
                return algs;
            }
            String packageName = "com.design.pattern.strategy.demo4.v2";
            String packageDirName = packageName.replace('.', '/');
            String dirPath = Thread.currentThread().getContextClassLoader().getResource(packageDirName).getPath();
            for (File f : new File(dirPath).listFiles()) {
                if (f.getName().endsWith("Sort.class")) {
                    try {
                        Class<?> clazz = Class.forName(packageName + "." + f.getName().substring(0, f.getName().length() - ".class".length()));
                        if (clazz.isAnnotationPresent(SortAlgStrategy.class)) {
                            Object strategy = clazz.newInstance();
                            if (strategy instanceof ISortAlg) {
                                algs.put(clazz.getAnnotation(SortAlgStrategy.class).sortName(), (ISortAlg) strategy);
                            }
                        }
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            return algs;
        }
    }
}
