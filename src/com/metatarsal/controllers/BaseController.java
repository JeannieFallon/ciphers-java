package com.metatarsal.controllers;

public class BaseController {

    private Rot13Controller rot13Controller;
    private CaesarController caesarController;
    private VigenereController vigenereController;

    public void index() {

        initialize();

        String rText = rot13Controller.rot13Cipher();
        String cText = caesarController.caesarCipher();
        String vText = vigenereController.vigenereCipher();

        System.out.println(rText);
        System.out.println(cText);
        System.out.println(vText);
    }

    private void initialize() {
        rot13Controller = new Rot13Controller();
        caesarController = new CaesarController();
        vigenereController = new VigenereController();
    }
}
