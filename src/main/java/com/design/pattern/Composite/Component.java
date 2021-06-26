package com.design.pattern.Composite;

import lombok.AllArgsConstructor;

/**
 * 对象声明接口
 * 
 * @author yj
 * 
 */
@AllArgsConstructor
public abstract class Component {
	protected String name;

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract void display(int depth);
}
