package com.metatarsal.controllers;

import com.metatarsal.models.CaesarText;

public class CaesarController {

    public CaesarText caesarCipher(CaesarText text) {
        text.setCipherText("This is Caesar cipher text.");
        return text;
    }
}
