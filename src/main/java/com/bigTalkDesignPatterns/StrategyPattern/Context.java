package com.bigTalkDesignPatterns.StrategyPattern;

import lombok.AllArgsConstructor;

/**
 * 上下文
 * 
 * @author clarck
 * 
 */
@AllArgsConstructor
public class Context {
	Strategy strategy;

	//上下文接口
	public void ContextInterface() {
		this.strategy.algorithmInterface();
	}
}
