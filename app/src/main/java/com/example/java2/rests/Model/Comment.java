package com.example.java2.rests.Model;

import java.io.Serializable;

/**
 * Created by java2 on 11/10/2016.
 */

public class Comment implements Serializable {
    int score;
    Owner owner;
    long post_id;

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
    }

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
