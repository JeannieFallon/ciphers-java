package com.metatarsal.controllers;

import com.metatarsal.models.CaesarText;
import com.metatarsal.models.Rot13Text;
import com.metatarsal.models.VigenereText;

public class BaseController {

    private Rot13Controller rot13Controller;
    private CaesarController caesarController;
    private VigenereController vigenereController;

    public void index() {

        initialize();

        // test vals
        String plainText = "This is plain text";
        int key = 1;
        String keyword = "abc";

        Rot13Text rText = rot13Controller.rot13Cipher(new Rot13Text(plainText));
        CaesarText cText = caesarController.caesarCipher(new CaesarText(plainText, key));
        VigenereText vText = vigenereController.vigenereCipher(new VigenereText(plainText, keyword));

        System.out.println(rText.getCipherText());
        System.out.println(cText.getCipherText());
        System.out.println(vText.getCipherText());
    }

    private void initialize() {
        rot13Controller = new Rot13Controller();
        caesarController = new CaesarController();
        vigenereController = new VigenereController();
    }
}
