package com.design.pattern.visitor.demo2.v6;

/**
 * @author yangsanity
 */
public class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.PPT;
    }

    //...
}
