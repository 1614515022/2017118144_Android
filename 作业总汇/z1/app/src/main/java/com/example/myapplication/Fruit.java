package com.example.myapplication;

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){name=n;}
    public int getImageId() {return imageId; }
}
