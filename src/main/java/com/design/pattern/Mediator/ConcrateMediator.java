package com.design.pattern.Mediator;

import lombok.Setter;

/**
 * 具体中介者类
 *
 * @author yj
 *
 */
@Setter
public class ConcrateMediator extends Mediator {
	private ConcrateColleague1 colleague1;
	private ConcrateColleague2 colleague2;
	
	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == colleague1) {
			colleague2.notify(message);
		} else {
			colleague1.notify(message);
		}
	}
	
}
