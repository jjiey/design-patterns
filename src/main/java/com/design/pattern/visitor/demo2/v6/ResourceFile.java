package com.design.pattern.visitor.demo2.v6;

/**
 * @author yangsanity
 */
public abstract class ResourceFile {

    protected String filePath;

    protected ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    public abstract ResourceFileType getType();
}
