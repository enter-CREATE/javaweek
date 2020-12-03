package com.company.springbootsell.controller;

import com.company.springbootsell.dataobject.Users;
import com.company.springbootsell.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * 登录
 */
@Controller
@RequestMapping("/seller/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/")
    public ModelAndView loginPage(){
        return new ModelAndView("user/login");
    }

    @PostMapping("/login")
    public ModelAndView login(@Valid Users user, ModelAndView mv){
        Users users=usersService.findByUserNameAndPassword(user.getUserName(),user.getPassword());
        if (users!=null){
            mv.setViewName("redirect:/seller/product/list");
        }else {
            mv.setViewName("redirect:/seller/user/");
        }
        return mv;
    }

    @GetMapping("/logon")
    public ModelAndView logonPage(){
        return new ModelAndView("user/logon");
    }
}
