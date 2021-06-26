package com.design.pattern.state.demo3.v4;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        MarioStateMachine4 mario = new MarioStateMachine4();
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
