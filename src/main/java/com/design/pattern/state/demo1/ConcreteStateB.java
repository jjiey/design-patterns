package com.design.pattern.state.demo1;

/**
 * 具体状态类B
 *
 * @author yj
 */
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}
}
