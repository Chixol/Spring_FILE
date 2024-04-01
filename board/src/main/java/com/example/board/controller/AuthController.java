package com.example.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/auth")
public class AuthController {
    @RequestMapping(value = "/sign-in", method = {RequestMethod.POST})
    public String 
}
