package com.metatarsal.ciphers.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CaesarText extends Text {

    private int key;

    public CaesarText(String plainText, int key) {
        super();
        this.plainText = plainText;
        this.key = key;
    }
}
