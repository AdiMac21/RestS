package com.example.java2.rests.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by java2 on 11/10/2016.
 */

public class User implements Serializable {

    String display_name;
    String profile_image;
    long user_id;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }
}
