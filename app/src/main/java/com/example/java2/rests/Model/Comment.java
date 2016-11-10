package com.example.java2.rests.Model;

/**
 * Created by java2 on 11/10/2016.
 */

public class Comment {
    int score;
    Owner owner;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
