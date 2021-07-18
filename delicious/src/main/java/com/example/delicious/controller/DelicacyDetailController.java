package com.example.delicious.controller;


import com.example.delicious.dataobject.DelicacyDetail;
import com.example.delicious.exception.SellException;
import com.example.delicious.services.DetailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import utils.KeyUtil;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
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

    @GetMapping("/index")
    public ModelAndView save(@RequestParam(value = "detailId",required = false)String detailId,
                             Map<String ,Object> map){
        if (!StringUtils.isEmpty(detailId)){
            //修改
            DelicacyDetail delicacyDetail=detailService.findOne(detailId);
            map.put("delicacyDetail",delicacyDetail);
        }
        //查询类目并且返回
        return new ModelAndView("detail/index");
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid DelicacyDetail delicacyDetail,
                             BindingResult bindingResult,
                             Map<String,Object> map){
        if (bindingResult.hasErrors()){
            //返回错误页面
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/delicious/detail/index");
            return new ModelAndView("/common/error");
        }
        DelicacyDetail delicacyDetail1=new DelicacyDetail();
        try{
            if (!StringUtils.isEmpty(delicacyDetail.getDetailId())){
                delicacyDetail=detailService.findOne(delicacyDetail.getDetailId());
            }else {
                delicacyDetail.setDetailId(KeyUtil.genUniqueKey());
            }
            BeanUtils.copyProperties(delicacyDetail,delicacyDetail);
            detailService.save(delicacyDetail);
        }catch (SellException exception){
            map.put("msg",exception.getMessage());
            map.put("url","/delicious/detail/index");
            return new ModelAndView("common/error",map);
        }

        map.put("url","");
        return new ModelAndView("common/success",map);
    }
}
