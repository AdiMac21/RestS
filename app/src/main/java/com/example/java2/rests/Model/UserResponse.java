package com.example.java2.rests.Model;

import com.example.java2.rests.Model.User;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by java2 on 11/10/2016.
 */

public class UserResponse implements Serializable {

    private ArrayList<User> items;

    public ArrayList<User> getItems() {
        return items;
    }

    public void setItems(ArrayList<User> items) {
        this.items = items;
    }
}
