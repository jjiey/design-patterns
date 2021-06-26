package com.design.pattern.state.demo1;

/**
 * 具体状态类A，每个子类实现一个与Context的一个状态相关的行为
 *
 * @author yj
 */
public class ConcrateStateA extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcrateStateB());
	}
}
