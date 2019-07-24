package com.metatarsal.ciphers.controllers;

import com.metatarsal.ciphers.models.CaesarText;
import com.metatarsal.ciphers.models.Rot13Text;
import com.metatarsal.ciphers.models.VigenereText;
import com.metatarsal.ciphers.services.CipherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

    @Autowired
    Rot13Controller rot13Controller;
    @Autowired
    CaesarController caesarController;
    @Autowired
    VigenereController vigenereController;
    @Autowired
    CipherService cipherService;

    public void index() {

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

    public StringBuilder getStringBuilder() {
        return new StringBuilder();
    }
}
