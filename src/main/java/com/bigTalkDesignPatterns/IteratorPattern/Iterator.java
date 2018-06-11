package com.bigTalkDesignPatterns.IteratorPattern;

/**
 * 迭代器抽象类
 * 
 * @author yj
 * 
 */
public abstract class Iterator {
	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();
}
