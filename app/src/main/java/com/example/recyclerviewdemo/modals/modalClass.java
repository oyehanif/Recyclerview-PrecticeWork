package com.example.recyclerviewdemo.modals;

public class modalClass {

    int image;
    String name;
    String msg;

    public modalClass(int image, String name, String msg) {
        this.image = image;
        this.name = name;
        this.msg = msg;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
