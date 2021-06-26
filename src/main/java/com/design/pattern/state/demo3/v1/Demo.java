package com.design.pattern.state.demo3.v1;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        MarioStateMachine1 mario = new MarioStateMachine1();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
