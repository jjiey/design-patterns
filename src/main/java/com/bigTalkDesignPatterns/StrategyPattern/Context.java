package com.bigTalkDesignPatterns.StrategyPattern;

import lombok.AllArgsConstructor;

/**
 * 上下文
 * 
 * @author yj
 * 
 */
@AllArgsConstructor
public class Context {
	Strategy strategy;

	//上下文接口
	public void ContextInterface() {
		this.strategy.algorithmInterface();
	}

//	//也可以策略与简单工厂结合:增加构造方法如下
//	Demo demo = null;
//	public Context(String type) {
//		switch (type) {
//			case "1" :
//				demo = new A();
//				break;
//			case "2" :
//				demo = new B();
//				break;
//		}
//	}
}
