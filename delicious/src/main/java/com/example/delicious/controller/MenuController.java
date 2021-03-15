package com.example.delicious.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/delicious/menu")
public class MenuController {

    @GetMapping("/menu")
    public ModelAndView menuPage(){return new ModelAndView("menu/menu");}
}
