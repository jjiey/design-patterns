package com.design.pattern.template.demo1;

/**
 * 单元测试类
 *
 * @author yj
 */
public class Main {

	public static void main(String[] args) {
		AbstractClass abstractClass;

		abstractClass = new ConcrateClassA();
		abstractClass.templateMethod();
		
		abstractClass = new ConcrateClassB();
		abstractClass.templateMethod();
	}
}
