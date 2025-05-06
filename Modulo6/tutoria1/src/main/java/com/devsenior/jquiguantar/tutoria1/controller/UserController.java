package com.devsenior.jquiguantar.tutoria1.controller;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//creame una lista de ejemplo con 10 usuarios sin createUser 

@RestController
public class UserController {

    @RestController
    private List<UserDto> users = new ArrayList<>(Array.asList(
            new UserDto("Juan", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Pedro", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Maria", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Luis", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Ana", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Sofia", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Carlos", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Miguel", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),            
            new UserDto("Jose", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),
            new UserDto("Javier", "vKwZy@example.com", "123456", "1234567890", "Calle 123"),;
    // crea 10 usuarios de ejemplo

    @GetMapping("/users")
    public List<UserDto> getAll() {
        return users;
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
