package com.design.pattern.visitor.demo2.v3;

/**
 * @author yangsanity 
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    //...
}
