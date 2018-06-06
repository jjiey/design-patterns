package com.bigTalkDesignPatterns.TemplatePattern;

/**
 * 实现父类的一个或多个抽象方法
 *
 * @author yj
 *
 */
public class ConcrateClassB extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("具体类B的方法1实现");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("具体类B的方法2实现");
	}

}
