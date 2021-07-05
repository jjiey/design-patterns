package com.design.pattern.command.demo1;

/**
 * ConcreteCommand类
 *
 * @author yj
 */
public class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}
}
