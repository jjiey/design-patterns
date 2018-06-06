package com.bigTalkDesignPatterns.DecoratorPattern;

import lombok.Setter;

/**
 * 装饰抽象类，继承了Component,从外来类来扩展Component类的功能，
 * 但对于Component来说是不需要知道Decorator的存在的。
 * 
 * @author yj
 * 
 */
@Setter
public abstract class Decorator extends Component {
	protected Component component;

	@Override
	public void Operation() {
		if (component != null) {
			component.Operation();
		}
	}

}
