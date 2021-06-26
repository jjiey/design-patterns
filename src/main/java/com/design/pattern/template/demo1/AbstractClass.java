package com.design.pattern.template.demo1;

/**
 * 抽象模板，定义并实现了一个模板方法。
 * 
 * @author yj
 */
public abstract class AbstractClass {

	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("");
	}

	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();
}
