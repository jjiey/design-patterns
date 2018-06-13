package com.bigTalkDesignPatterns.VisitorPattern;

/**
 * Element类
 *
 * @author yj
 *
 */
public abstract class Element {

	public abstract void accept(Visitor visitor);

}
