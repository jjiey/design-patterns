package com.design.pattern.visitor.demo2.v1;

/**
 * @author yangsanity
 */
public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        //...
        System.out.println("Extract WORD.");
    }
}
