package com.company.springbootsell.controller;

import com.company.springbootsell.dataobject.OrderDetail;
import com.company.springbootsell.dataobject.OrderMaster;
import com.company.springbootsell.services.DetailService;
import com.company.springbootsell.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/seller/order")
public class OrderController {
    @Autowired
    MasterService masterService;

    @Autowired
    DetailService detailService;

    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<OrderMaster> list= masterService.findAll();
        map.put("orderList",list);
        return new ModelAndView("/order/list",map);
    }
    @GetMapping("/cancel")
    public ModelAndView cancel(@RequestParam(value = "orderId",required = false)String orderId,
                               ModelAndView view){
        masterService.cancel(orderId);
        view.setViewName("redirect:/seller/order/list");
        return view;
    }
    //详情页
    @GetMapping("/details")
    public ModelAndView details(@RequestParam(value = "orderId",required = false)String orderId,
                                @RequestParam(value = "detailId",required = false) String detailId,
                                Map<String,Object> map){
        OrderMaster master = masterService.findById(orderId);
        OrderDetail detail = detailService.findByOrderId(detailId);
        map.put("master", master);
        map.put("detail", detail);
        return new ModelAndView("order/details", map);
    }

}
