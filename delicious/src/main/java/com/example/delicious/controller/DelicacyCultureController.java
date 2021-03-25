package com.example.delicious.controller;

import com.example.delicious.dataobject.DelicacyCulture;
import com.example.delicious.services.CultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/culture")
public class DelicacyCultureController {

    @Autowired
    private CultureService cultureService;

    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<DelicacyCulture> list = cultureService.findAll();
        for(DelicacyCulture p:list){
            System.out.println(p);
        }
        map.put("cultureList",list);
        return new ModelAndView("/culture/list",map);
    }


}
