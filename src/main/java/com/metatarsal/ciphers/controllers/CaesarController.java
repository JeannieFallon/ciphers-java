package com.metatarsal.ciphers.controllers;

import com.metatarsal.ciphers.models.CaesarText;
import org.springframework.stereotype.Controller;

@Controller
public class CaesarController extends BaseController {

    public CaesarText caesarCipher(CaesarText text) {
        text.setCipherText("C cipher");
        return text;
    }
}
