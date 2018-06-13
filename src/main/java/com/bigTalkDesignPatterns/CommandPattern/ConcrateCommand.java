package com.bigTalkDesignPatterns.CommandPattern;

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
