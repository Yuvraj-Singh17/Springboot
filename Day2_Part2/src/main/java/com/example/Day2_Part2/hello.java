package com.example.Day2_Part2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hello {

    @GetMapping("/home")
    public String home(){
        return "Hello ";
    }
}