package com.bigTalkDesignPatterns.AbstractFactoryPattern;

import com.bigTalkDesignPatterns.FactoryPattern.Operation;

/**
 * 单元测试类
 *
 * @author yj
 *
 */
public class Main {

    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.createOperation();
        oper.setNumberA(5);
        oper.setNumberB(10);
        double result = oper.getResult();
        System.out.println(result);
    }

}
