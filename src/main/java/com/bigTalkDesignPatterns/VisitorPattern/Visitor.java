package com.bigTalkDesignPatterns.VisitorPattern;

/**
 * 为每一个Element类声明一个visitor操作
 *
 * @author yj
 *
 */
public abstract class Visitor {

	public abstract void visitConcrateElementA(ConcrateElementA concreateElementA);
	
	public abstract void visitConcrateElementB(ConcrateElementB concreateElementB);

}
