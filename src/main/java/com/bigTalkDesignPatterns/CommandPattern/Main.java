package com.bigTalkDesignPatterns.CommandPattern;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		Receiver reciver = new Receiver();
		Command command = new ConcrateCommand(reciver);
		Invoker invoker = new Invoker();
		
		invoker.setCommand(command);
		invoker.excuteCommand();
	}
}
