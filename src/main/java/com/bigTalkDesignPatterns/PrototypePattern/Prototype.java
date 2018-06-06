package com.bigTalkDesignPatterns.PrototypePattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 原型类
 * 
 * @author yj
 * 
 */
@Getter
@AllArgsConstructor
public abstract class Prototype {
	private String id;

	public abstract Prototype Clone();
}
