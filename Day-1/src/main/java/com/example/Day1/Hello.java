package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    //code yha likhna hai...
    @GetMapping("/")
    public String hello(){
        return "Hello!! , This is the beginning";
    }
    @GetMapping("/about")
    public String about(){
        return "This is About Page";
    }
    @GetMapping("/homepage")
    public String home(){
        return "this is homepage";
    }
    @GetMapping("/dashboard")
    public String dash(){
        return "this is dashboard";
    }
    @GetMapping("/logout")
    public String logout(){
        return "Bye! ,this is the end .";
    }
}
