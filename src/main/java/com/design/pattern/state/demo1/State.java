package com.design.pattern.state.demo1;

/**
 * State类，抽象状态类，定义了一个接口以封装与Context的一个特定状态相关的行为
 *
 * @author yj
 */
public abstract class State {

	public abstract void handle(Context context);
}
