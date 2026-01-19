package com.example.Day2_Part2.controller;

import java.util.ArrayList;
import com.example.Day2_Part2.StudentModel.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public ArrayList<StudentModel> student(){
        ArrayList<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel(1, "Yash", "maheshwariy077@gmail.com"));
        students.add(new StudentModel(2, "Yashasvi", "yashaswi@gmail.com"));
        students.add(new StudentModel(3, "YashRaj", "yashraj@gmail.com"));
        students.add(new StudentModel(4, "Yogendra", "yogendra@gmail.com"));
        students.add(new StudentModel(5, "Yuvraj", "yuvraj@gmail.com"));
        return students;
    }

}
