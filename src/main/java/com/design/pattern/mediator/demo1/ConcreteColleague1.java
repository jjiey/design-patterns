package com.design.pattern.mediator.demo1;

/**
 * 具体同事类1
 *
 * @author yj
 */
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(String.format("同事1得到信息:%s", message));
	}
}
