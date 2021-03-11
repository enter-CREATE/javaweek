package com.example.delicious.controller;

import com.example.delicious.dataobject.User;
import com.example.delicious.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/delicious/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView loginPage(){return new ModelAndView("user/login");}

    @PostMapping("/login")
    public ModelAndView login(@Valid User user,ModelAndView mv){
        User user1=userService.findByUserNameAndPassword(user.getUserName(),user.getPassword());
        if (user1!=null){
            mv.setViewName("redirect:/delicious/menu/menu");
        }else{
            mv.setViewName("redirect:/delicious/user/");
        }
        return mv;
    }

}
