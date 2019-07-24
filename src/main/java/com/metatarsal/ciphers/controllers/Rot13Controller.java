package com.metatarsal.ciphers.controllers;

import com.metatarsal.ciphers.models.Rot13Text;
import org.springframework.stereotype.Controller;

@Controller
public class Rot13Controller {

    public Rot13Text rot13Cipher(Rot13Text text) {
        text.setCipherText("R cipher");
        return text;
    }
}
