package com.example.java2.rests.Model;

import java.util.ArrayList;

/**
 * Created by java2 on 11/14/2016.
 */

public class QuestionsResponse {
    ArrayList<Questions> items;

    public ArrayList<Questions> getItems() {
        return items;
    }

    public void setItems(ArrayList<Questions> items) {
        this.items = items;
    }
}
