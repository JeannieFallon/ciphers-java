package com.metatarsal.models;

public class Rot13Text extends Text {

    private static final int KEY = 13;

    public Rot13Text(String plainText) {
        super();
        this.plainText = plainText;
    }
}
