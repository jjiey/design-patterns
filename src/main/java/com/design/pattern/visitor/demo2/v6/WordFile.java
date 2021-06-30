package com.design.pattern.visitor.demo2.v6;

/**
 * @author yangsanity
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.WORD;
    }

    //...
}
