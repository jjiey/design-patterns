package com.bigTalkDesignPatterns.PrototypePattern.formal2;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 原型类
 * Clone()由超类完成
 * 
 * @author yj
 * 
 */
@Getter
@AllArgsConstructor
public abstract class Prototype implements Cloneable {

	private String id;

	public Prototype Clone() {
		Prototype clone = null;
		try {
			clone = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
