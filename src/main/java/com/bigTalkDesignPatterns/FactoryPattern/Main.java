package com.bigTalkDesignPatterns.FactoryPattern;

/**
 * 单元测试类
 * @author yj
 */
public class Main {

    public static void main(String[] args) {
        String operate = "+";
        Operation operation = OperationFactory.createOperate(operate);
        operation.setNumberA(5);
        operation.setNumberB(10);
        double result = operation.getResult();
        System.out.println(result);
    }

}
