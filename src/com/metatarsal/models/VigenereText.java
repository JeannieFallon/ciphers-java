package com.metatarsal.models;

public class VigenereText extends Text {

    private String keyword;

    public VigenereText(String plainText, String keyword) {
        super();
        this.plainText = plainText;
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
