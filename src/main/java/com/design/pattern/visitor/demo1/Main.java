package com.design.pattern.visitor.demo1;

/**
 * 单元测试类
 *
 * @author yj
 */
public class Main {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new ConcreteElementA());
		objectStructure.attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		objectStructure.accept(v1);
		objectStructure.accept(v2);
	}
}
