package com.example.java2.rests.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by java2 on 11/10/2016.
 */

public class CommentsResponse implements Serializable {

    private ArrayList<Comment> items;

    public ArrayList<Comment> getItems() {
        return items;
    }

    public void setItems(ArrayList<Comment> items) {
        this.items = items;
    }
}
