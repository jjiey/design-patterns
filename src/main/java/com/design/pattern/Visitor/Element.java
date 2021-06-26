package com.design.pattern.Visitor;

/**
 * Element类
 *
 * @author yj
 *
 */
public abstract class Element {

	public abstract void accept(Visitor visitor);

}
