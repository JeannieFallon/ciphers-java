package com.metatarsal.ciphers.controllers;

import com.metatarsal.ciphers.models.VigenereText;
import org.springframework.stereotype.Controller;

@Controller
public class VigenereController {

    public VigenereText vigenereCipher(VigenereText text) {
        text.setCipherText("V cipher");
        return text;
    }
}