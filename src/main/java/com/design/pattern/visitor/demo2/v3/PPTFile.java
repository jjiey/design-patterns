package com.design.pattern.visitor.demo2.v3;

/**
 * @author yangsanity 
 */
public class PPTFile extends ResourceFile {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    //...
}
