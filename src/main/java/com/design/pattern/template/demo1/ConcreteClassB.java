package com.design.pattern.template.demo1;

/**
 * 实现父类的一个或多个抽象方法
 *
 * @author yj
 */
public class ConcreteClassB extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("class B primitiveOperation1");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("class B primitiveOperation2");
	}
}
