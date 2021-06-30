package com.design.pattern.visitor.demo2.v5;

/**
 * @author yangsanity
 */
public abstract class ResourceFile {

    protected String filePath;

    protected ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);
}
