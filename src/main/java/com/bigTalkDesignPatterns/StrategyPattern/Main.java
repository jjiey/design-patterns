package com.bigTalkDesignPatterns.StrategyPattern;

/**
 * 单元测试类
 * 
 * @author yj
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		Context context;
		context = new Context(new ConcreateStrategyA());
		context.ContextInterface();
		
		context = new Context(new ConcreateStrategyB());
		context.ContextInterface();
		
		context = new Context(new ConcreateStrategyC());
		context.ContextInterface();
	}
	
}
