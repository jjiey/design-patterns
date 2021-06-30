package com.design.pattern.visitor.demo2.v5;

/**
 * @author yangsanity
 */
public interface Visitor {

    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}
