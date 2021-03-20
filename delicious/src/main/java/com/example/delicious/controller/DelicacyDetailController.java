package com.example.delicious.controller;


import com.example.delicious.dataobject.DelicacyDetail;
import com.example.delicious.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/delicious/detail")
public class DelicacyDetailController {
    @Autowired
    private DetailService detailService;

    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<DelicacyDetail> list=detailService.findUpAll();
        map.put("detailList",list);
        return new ModelAndView("/detail/list",map);
    }
}
