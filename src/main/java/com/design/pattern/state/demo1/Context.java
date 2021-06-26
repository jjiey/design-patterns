package com.design.pattern.state.demo1;

import lombok.AllArgsConstructor;

/**
 * Context类，维护一个ConcrateState子类的实例，这个实例定义为当前的状态
 *
 * @author yj
 */
@AllArgsConstructor
public class Context {

	private State state;

	public void setState(State mState) {
		this.state = mState;
		System.out.println(String.format("当前状态：%s", mState.getClass().getName()));
	}

	public void request() {
		state.handle(this);
	}
}
