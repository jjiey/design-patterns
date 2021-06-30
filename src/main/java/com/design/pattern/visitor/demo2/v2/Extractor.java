package com.design.pattern.visitor.demo2.v2;

/**
 * 访问者类 抽取 功能
 *
 * @author yangsanity
 */
public class Extractor {

    public void extract2txt(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
