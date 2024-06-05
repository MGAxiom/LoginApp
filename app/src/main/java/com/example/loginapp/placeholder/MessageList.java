package com.example.loginapp.placeholder;

import android.media.Image;

import java.util.List;

public class MessageList {
    private final String userName = "";
    private final String name;
    private final String description;
    private final Image image;

    public MessageList(String name, String description, Image image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Image getImage() {
        return image;
    }
}
