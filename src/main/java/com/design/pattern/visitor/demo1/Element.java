package com.design.pattern.visitor.demo1;

/**
 * Element类
 *
 * @author yj
 */
public abstract class Element {

	public abstract void accept(Visitor visitor);
}
