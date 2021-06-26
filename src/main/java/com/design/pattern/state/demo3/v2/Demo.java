package com.design.pattern.state.demo3.v2;

import com.design.pattern.state.demo3.State;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        MarioStateMachine2 mario = new MarioStateMachine2();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
