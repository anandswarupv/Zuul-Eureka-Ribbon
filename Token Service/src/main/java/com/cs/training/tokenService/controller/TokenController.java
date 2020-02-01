package com.cs.training.tokenService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @Value("${server.port}")
    private String portNumber;

    @RequestMapping("/token")
    public String generateToken()  {
        return "Token generated from Service running on port: " + portNumber;
    }

}
