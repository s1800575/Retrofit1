package com.example.retrofit1;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private int id;
    private String title;

    // annotaatio, käytöämme muuttujaa text -ohjelmassa, mutta body JSONissa

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }


}

