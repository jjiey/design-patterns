package com.bigTalkDesignPatterns.MediatorPattern;

/**
 * 抽象中介者类
 *
 * @author yj
 *
 */
public abstract class Mediator {

	public abstract void send(String message, Colleague colleague);

}
