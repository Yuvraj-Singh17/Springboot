package com.example.Day2_Part2.controller;

import com.example.Day2_Part2.StudentModel.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public StudentModel Student(){
        StudentModel student = new StudentModel(18,"Virat","vk@gmail.com");
        return student;
    }

}
