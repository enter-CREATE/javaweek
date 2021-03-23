package com.example.delicious.controller;


import com.example.delicious.dataobject.DelicacyDetail;
import com.example.delicious.services.DetailService;
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

    @RequestMapping(value = "select")
    //模糊查询
    public String select(Model model, HttpServletRequest request) {
        String delicacy_detail=request.getParameter("delicacy_detail");		//获取html页面搜索框的值
        List<DelicacyDetail> unit=detailService.findByName(delicacy_detail);	//在数据库中进行查询
        model.addAttribute("unit", unit);	//模板映射
        return "detail/select";
    }

}
