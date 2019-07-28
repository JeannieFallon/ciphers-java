package com.metatarsal.ciphers.controllers;

import com.metatarsal.ciphers.models.CaesarText;
import com.metatarsal.ciphers.models.Rot13Text;
import com.metatarsal.ciphers.models.VigenereText;
import com.metatarsal.ciphers.services.CipherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);
        String plainText, keyword;
        int key;

        System.out.println("Enter plaintext:");
        plainText = scanner.next();

        System.out.println("Enter a positive integer as the key for the Caesar cipher:");
        key = scanner.nextInt();

        System.out.println("Enter a key word for the Vigenere cipher:");
        keyword = scanner.next();

        Rot13Text rText = rot13Controller.rot13Cipher(new Rot13Text(plainText));
        CaesarText cText = caesarController.caesarCipher(new CaesarText(plainText, key));
        VigenereText vText = vigenereController.vigenereCipher(new VigenereText(plainText, keyword));

        System.out.println("ROT13:\n" + rText.getCipherText());
        System.out.println("Caesar:\n" + cText.getCipherText());
        System.out.println("Vigenere:\n" +  vText.getCipherText());
    }

    public StringBuilder getStringBuilder() {
        return new StringBuilder();
    }
}
