package com.design.pattern.state.demo3.v3;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        MarioStateMachine3 mario = new MarioStateMachine3();
        mario.obtainMushRoom();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());
        mario.obtainCape();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());
        mario.obtainFireFlower();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());
        mario.meetMonster();
        System.out.println("mario score: " + mario.getScore() + "; state: " + mario.getCurrentState());
    }
}
