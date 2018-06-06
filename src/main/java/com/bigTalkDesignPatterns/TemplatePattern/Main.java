package com.bigTalkDesignPatterns.TemplatePattern;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		AbstractClass abstractClass;
		abstractClass = new ConcrateClassA();
		abstractClass.TemplateMethod();
		
		abstractClass = new ConcrateClassB();
		abstractClass.TemplateMethod();
	}
}
