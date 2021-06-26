package com.design.pattern.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题/抽象通知者
 *
 * @author yj
 */
public class Subject {

	private final List<Observer> observers;

	public Subject() {
		observers = new ArrayList<>();
	}

	/**
	 * 添加观察者
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 移除观察者
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * 通知
	 */
	public void notification() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
