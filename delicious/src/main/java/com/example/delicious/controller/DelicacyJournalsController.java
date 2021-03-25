package com.example.delicious.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/delicacy/journals")
public class DelicacyJournalsController {

    @GetMapping("/journals")
    public ModelAndView journals(){
        return new ModelAndView("delicacyJournals/delicacyJournals");
    }
}
