package com.design.pattern.command.demo1;

import lombok.AllArgsConstructor;

/**
 * Command类用来声明执行操作的接口
 *
 * @author yj
 */
@AllArgsConstructor
public abstract class Command {

	protected Receiver receiver;

	public abstract void execute();
}
