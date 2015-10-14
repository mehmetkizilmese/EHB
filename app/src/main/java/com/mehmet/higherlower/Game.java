package com.mehmet.higherlower;

import java.util.Random;

/**
 * Created by m on 14/10/2015.
 */
public class Game {

    private int current;
    private int score;
    final int min  = 1;
    final int max = 12;

    public Game(int current){
        this.current = current;
    }

    private int getRandom()
    {
        return new Random().nextInt((max - min ) + 1) + min;
    }

    private Playtype getAnswer(int toPlay){
       if(toPlay < getCurrent())
           return Playtype.LOWER;
       else if(toPlay > getCurrent())
           return Playtype.HIGHER;
       else
           return Playtype.EQUAL;
    }

    public int getCurrent()
    {
        return current;
    }

    public boolean play(Playtype played)
    {
        int randomValue = getRandom();
        if(getAnswer(randomValue) == played) {
            this.current = randomValue;
            this.score++;
            return true;
        }
        this.current = randomValue;
        this.score = 0;
        return false;
    }

    public int getScore()
    {
        return score;
    }
}

