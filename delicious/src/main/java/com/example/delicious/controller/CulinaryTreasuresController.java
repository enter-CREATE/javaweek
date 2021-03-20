package com.example.delicious.controller;

import com.example.delicious.dataobject.CulinaryTreasures;
import com.example.delicious.services.TreasuresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/delicious/treasures")
public class CulinaryTreasuresController {
    @Autowired
    private TreasuresService treasuresService;

    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<CulinaryTreasures> list=treasuresService.findAll();
        map.put("treasuresList",list);
        return new ModelAndView("/treasures/list",map);
    }
}
