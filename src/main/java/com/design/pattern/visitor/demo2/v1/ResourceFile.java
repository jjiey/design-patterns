package com.design.pattern.visitor.demo2.v1;

/**
 * @author yangsanity
 */
public abstract class ResourceFile {

    protected String filePath;

    protected ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}
