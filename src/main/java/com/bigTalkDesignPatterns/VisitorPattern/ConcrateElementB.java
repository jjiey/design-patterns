package com.bigTalkDesignPatterns.VisitorPattern;

/**
 * ConcrateElementB
 *
 * @author yj
 *
 */
public class ConcrateElementB extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcrateElementB(this);
	}

	/*
	 * 其他的相关方法
	 */
	public void opreationB() {
		
	}
}
