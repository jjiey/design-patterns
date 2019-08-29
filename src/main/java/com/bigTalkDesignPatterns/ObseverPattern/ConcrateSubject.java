package com.bigTalkDesignPatterns.ObseverPattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 具体主题/具体通知者
 * @author yj
 */
@Setter
@Getter
public class ConcrateSubject extends Subject {

	private String subjectState; // 被观察者状态

}
