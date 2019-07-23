package com.metatarsal.controllers;

import com.metatarsal.models.VigenereText;

public class VigenereController {

    public VigenereText vigenereCipher(VigenereText text) {
        text.setCipherText("This is Vigenere cipher text.");
        return text;
    }
}
