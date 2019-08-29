package com.bigTalkDesignPatterns.AbstractFactoryPattern;

import com.bigTalkDesignPatterns.FactoryPattern.Operation;

/**
 * 单元测试类
 * @author yj
 */
public class Main {

    public static void main(String[] args) {
        IFactory operationFactory = new AddFactory();
        Operation operation = operationFactory.createOperation();
        operation.setNumberA(5);
        operation.setNumberB(10);
        double result = operation.getResult();
        System.out.println(result);
    }

}
