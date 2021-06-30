package com.design.pattern.visitor.demo2.v5;

/**
 * 访问者类 抽取 功能
 *
 * @author yangsanity
 */
public class Extractor implements Visitor {

    @Override
    public void visit(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
