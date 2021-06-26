package com.design.pattern.Mediator;

/**
 * 具体同事类2
 *
 * @author yj
 *
 */
public class ConcrateColleague2 extends Colleague{

	public ConcrateColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(String.format("同事2得到信息:%s", message));
	}

}
