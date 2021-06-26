package com.design.pattern.Command;

import lombok.Setter;

/**
 * Invoker类，要求该命令执行这个请求
 *
 * @author yj
 *
 */
@Setter
public class Invoker {
	private Command command;

	public void excuteCommand() {
		command.execute();
	}
}
