package com.example.Day2_Part2.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    public String homepage(){
        return "This is homepage";
    }
}
