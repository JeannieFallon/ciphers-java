package com.metatarsal.ciphers.models;

import lombok.Data;

@Data
public abstract class Text {

    String plainText;
    String cipherText;

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
}
