package com.metatarsal.models;

public class CaesarText extends Text {

    private int key;

    public CaesarText(String plainText, int key) {
        super();
        this.plainText = plainText;
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
