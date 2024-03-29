package com.design.pattern.command.demo1;

import lombok.Setter;

/**
 * Invoker类，要求该命令执行这个请求
 *
 * @author yj
 */
@Setter
public class Invoker {

	private Command command;

	public void executeCommand() {
		command.execute();
	}
}
