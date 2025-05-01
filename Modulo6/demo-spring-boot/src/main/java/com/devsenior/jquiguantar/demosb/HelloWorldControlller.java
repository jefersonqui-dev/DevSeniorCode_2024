package com.devsenior.jquiguantar.demosb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlller {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
