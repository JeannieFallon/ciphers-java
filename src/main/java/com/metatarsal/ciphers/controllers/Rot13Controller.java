package com.metatarsal.ciphers.controllers;

import com.metatarsal.ciphers.models.Rot13Text;
import org.springframework.stereotype.Controller;

@Controller
public class Rot13Controller extends BaseController {

    public Rot13Text rot13Cipher(Rot13Text text) {

        String cipherText;

        // test
        char testChar = cipherService.GetCipherLetter('a', 1);
        sb.append(testChar);

        text.setCipherText(sb.toString());

        return text;
    }
}
