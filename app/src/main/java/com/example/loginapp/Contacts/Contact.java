package com.example.loginapp.Contacts;

import java.io.Serializable;

public class Contact implements Serializable {
    private final String name;
    private final String description;
    private final int dog;


    public Contact(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.dog = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return dog;
    }
}
