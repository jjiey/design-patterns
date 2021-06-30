package com.design.pattern.visitor.demo2.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);

        Extractor extractor = new Extractor();
        for (ResourceFile resourceFile : resourceFiles) {
            // Cannot resolve method 'extract2txt(com.design.pattern.visitor.demo2.v2.ResourceFile)'
            //extractor.extract2txt(resourceFile);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}