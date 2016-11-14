package com.example.java2.rests.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by java2 on 11/10/2016.
 */

public class PostResponse implements Serializable {

    private ArrayList<Post> items;

    public ArrayList<Post> getItems() {
        return items;
    }

    public void setItems(ArrayList<Post> items) {
        this.items = items;
    }
}
