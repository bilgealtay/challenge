package com.example.test.codewars.control;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by bilga
 */
@Service
public class Encode {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Encode(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public String fill() {
        String password = "1234";
        String encodePassword = bCryptPasswordEncoder.encode(password);
        System.out.println(encodePassword);
        return encodePassword;
    }

}
