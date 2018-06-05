package com.bigTalkDesignPatterns.FactoryPattern;

public class Main {

    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperate("+");
        oper.setNumberA(5);
        oper.setNumberB(10);
        double result = oper.getResult();
        System.out.println(result);
    }

}
