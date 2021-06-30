package com.design.pattern.visitor.demo1;

/**
 * ConcreteElementA
 *
 * @author yj
 *
 */
public class ConcreteElementA extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	/*
	 * 其他的相关方法
	 */
	public void opreationA() {}
}
