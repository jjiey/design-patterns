package com.design.pattern.Command;

/**
 * ConcrateCommand类
 *
 * @author yj
 *
 */
public class ConcrateCommand extends Command {

	public ConcrateCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
