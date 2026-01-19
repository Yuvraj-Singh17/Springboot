package com.example.Day2_Part2;

import com.example.Day2_Part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class hello {

    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(18,"Virat","vk@gmail.com");
        return student;
    }
}