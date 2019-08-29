package com.bigTalkDesignPatterns.ObseverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题/抽象通知者
 * @author yj
 */
public class Subject {

	private List<Observer> observers = new ArrayList<>();

	/**
	 * 添加观察者
	 * @param observer
	 */
	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
	 * 移除观察者
	 * @param observer
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
