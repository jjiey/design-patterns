package com.bigTalkDesignPatterns.MementoPattern;

import lombok.Getter;
import lombok.Setter;

/**
 * 发起人
 * 
 * @author clarck
 * 
 */
@Setter
public class Originator {
	/**
	 * 需要保存的属性，可能有多个
	 */
	private String state;

	/**
	 * 创建备忘录
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 使用备忘回复当前状态
	 */
	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}
	
	public void show() {
		System.out.println(String.format("state=%s", state));
	}
}
