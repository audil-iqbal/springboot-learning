package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
public class AppConfiguration {
    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam(value = "cname",required = false) String courseName){
        ModelAndView mv = new ModelAndView();
        mv.addObject("cname",courseName);
        mv.setViewName("course");
        System.out.println("Audil iqbal: "+courseName);
        return mv;
    }
}
