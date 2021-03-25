package com.example.delicious.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/delicacy/news")
public class delicacyNewsController {

    @GetMapping("/news")
    public ModelAndView news(){
        return new ModelAndView("delicacyNews/delicacyNews");
    }

    @GetMapping("/news1")
    public ModelAndView news1(){
        return new ModelAndView("delicacyNews/delicacyNews_1");
    }
}
