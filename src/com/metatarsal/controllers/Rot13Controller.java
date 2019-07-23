package com.metatarsal.controllers;

import com.metatarsal.models.Rot13Text;

public class Rot13Controller extends BaseController{

    public Rot13Text rot13Cipher(Rot13Text text) {
        text.setCipherText("This is ROT13 cipher text.");
        return text;
    }
}
