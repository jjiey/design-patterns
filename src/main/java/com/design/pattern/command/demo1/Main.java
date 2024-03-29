package com.design.pattern.command.demo1;

/**
 * 单元测试类
 *
 * @author yj
 */
public class Main {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		
		invoker.setCommand(command);
		invoker.executeCommand();
	}
}
