package com.design.pattern.observer.demo1;

/**
 * 具体观察者
 *
 * @author yj
 */
public class ConcreteObserver extends Observer {

	private final String observerName;

	private final ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject, String observerName) {
		this.subject = subject;
		this.observerName = observerName;
	}

	@Override
	public void update() {
		String observerState = subject.getSubjectState();
		String format = String.format("观察者 %s 的新状态是 %s", observerName, observerState);
		System.out.println(format);
	}
}
