package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @RequestMapping("/courses")
    public String courses(){

        return "course";
    }
}
