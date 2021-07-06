package com.design.pattern.mediator.demo1;

/**
 * 具体同事类2
 *
 * @author yj
 */
public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(String.format("同事2得到信息:%s", message));
	}
}
