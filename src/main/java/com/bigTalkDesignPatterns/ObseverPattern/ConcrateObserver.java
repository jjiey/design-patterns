package com.bigTalkDesignPatterns.ObseverPattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 具体观察者
 * 
 * @author yj
 * 
 */
public class ConcrateObserver extends Observer {

	private String name;
	private String observerState;
	@Getter
	@Setter
	private ConcrateSubject subject;

	public ConcrateObserver(ConcrateSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		String format = String.format("观察者%s的新状态是%s", name, observerState);
		System.out.println(format);
	}

}
