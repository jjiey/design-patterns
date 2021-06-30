package com.design.pattern.visitor.demo2.v4;

/**
 * 访问者类 压缩 功能
 *
 * @author yangsanity
 */
public class Compressor {

    public void compress(PPTFile pptFile) {
        //...
        System.out.println("Compress PPT.");
    }

    public void compress(PdfFile pdfFile) {
        //...
        System.out.println("Compress PDF.");
    }

    public void compress(WordFile wordFile) {
        //...
        System.out.println("Compress WORD.");
    }
}
