package com.design.pattern.visitor.demo2.v5;

/**
 * 访问者类 压缩 功能
 *
 * @author yangsanity
 */
public class Compressor implements Visitor {

    @Override
    public void visit(PPTFile pptFile) {
        //...
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Compress PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //...
        System.out.println("Compress WORD.");
    }
}
