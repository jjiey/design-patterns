package com.design.pattern.Visitor;

/**
 * ConcrateElementA
 *
 * @author yj
 *
 */
public class ConcrateElementA extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcrateElementA(this);
	}

	/*
	 * 其他的相关方法
	 */
	public void opreationA() {
		
	}
}
