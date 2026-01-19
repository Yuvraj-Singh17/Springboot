package com.example.Revision_Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Revision {
    //code yha likhna hai...
    @GetMapping("/")
    public String hello() {
        return "Hello , this is revision.";
    }

}