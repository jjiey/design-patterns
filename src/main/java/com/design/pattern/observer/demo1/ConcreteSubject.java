package com.design.pattern.observer.demo1;

import lombok.Getter;
import lombok.Setter;

/**
 * 具体主题/具体通知者
 *
 * @author yj
 */
@Setter
@Getter
public class ConcreteSubject extends Subject {

	/**
	 * 被观察者状态
	 */
	private String subjectState;
}
