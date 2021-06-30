package com.design.pattern.visitor.demo1;

/**
 * ConcreteElementB
 *
 * @author yj
 */
public class ConcreteElementB extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	/*
	 * 其他的相关方法
	 */
	public void opreationB() {}
}
