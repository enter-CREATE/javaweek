package com.example.delicious.controller;

import com.example.delicious.dataobject.CulinaryTreasures;
import com.example.delicious.dataobject.DelicacyDetail;
import com.example.delicious.services.TreasuresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = "selects")
    //模糊查询
    public String select(Model model, HttpServletRequest request) {
        String delicacy_detail=request.getParameter("delicacy_detail");		//获取html页面搜索框的值
        List<CulinaryTreasures> units=treasuresService.findByName(delicacy_detail);	//在数据库中进行查询
        model.addAttribute("units", units);	//模板映射
        return "treasures/selects";
    }
}
