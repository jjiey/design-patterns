package com.design.pattern.visitor.demo1;

/**
 * 为每一个Element类声明一个visitor操作
 *
 * @author yj
 *
 */
public abstract class Visitor {

	public abstract void visitConcreteElementA(ConcreteElementA concreateElementA);
	
	public abstract void visitConcreteElementB(ConcreteElementB concreateElementB);
}
