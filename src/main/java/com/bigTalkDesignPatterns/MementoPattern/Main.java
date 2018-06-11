package com.bigTalkDesignPatterns.MementoPattern;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {
	public static void main(String[] args) {
		/**
		 * 发起人状态设置为on
		 */
		Originator originator = new Originator();
		originator.setState("On");
		originator.show();

		/**
		 * 管理者保存备忘录（发起人的状态）
		 */
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());

		/**
		 * 发起人状态设置为off
		 */
		originator.setState("Off");
		originator.show();

		/**
		 * 发起人使用备忘录恢复on状态
		 */
		originator.setMemento(caretaker.getMemento());
		originator.show();
	}
}
