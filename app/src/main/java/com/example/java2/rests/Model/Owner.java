package com.example.java2.rests.Model;

import java.io.Serializable;

/**
 * Created by java2 on 11/10/2016.
 */

public class Owner implements Serializable {
    String display_name;

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }
}
