package com.design.pattern.visitor.demo1;

/**
 * 具体访问者2
 *
 * @author yj
 */
public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreateElementA) {
		System.out.println(String.format("%s被%s访问", concreateElementA.getClass().getName(), this.getClass().getName()));
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreateElementB) {
		System.out.println(String.format("%s被%s访问", concreateElementB.getClass().getName(), this.getClass().getName()));
	}
}
