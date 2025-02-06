package com.ivoronlne.springboot_security_passwordencoders_sha256.controllers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //=================================================================
  // ENCODE PASSWORD
  //=================================================================
  @RequestMapping("/EncodePassword")
  public String encodePassword(@RequestParam String password) {

    //GET PASSWORD ENCODER
    PasswordEncoder passwordEncoder = new StandardPasswordEncoder();

    //ENCODE PASSWORD
    String encodedPassword = passwordEncoder.encode(password);

    //RETURN ENCODED PASSWORD
    return encodedPassword;

  }
  //====================================================================
  // HELLO
  //====================================================================
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
