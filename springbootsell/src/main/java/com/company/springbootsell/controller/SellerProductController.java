package com.company.springbootsell.controller;

import com.company.springbootsell.dataobject.ProductCategory;
import com.company.springbootsell.dataobject.ProductInfo;
import com.company.springbootsell.exception.SellException;
import com.company.springbootsell.form.ProductForm;
import com.company.springbootsell.services.CategoryService;
import com.company.springbootsell.services.ProductService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import utils.KeyUtil;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * 商家商品控制
 */
@Controller
@RequestMapping("/seller/product")
public class SellerProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/list")
    public ModelAndView list(@RequestParam(value = "page",defaultValue = "1")Integer page,
                             @RequestParam(value = "size",defaultValue = "5")Integer size,
                             Map<String,Object> map){
        PageRequest pageRequest=PageRequest.of(page-1,size);
        Page<ProductInfo> productInfoPage=productService.findAll(pageRequest);
        map.put("productInfoPage",productInfoPage);
        map.put("currentPage",page);
        map.put("size",size);
        return new ModelAndView("product/list",map);
    }

    @GetMapping("/index")
    public ModelAndView save(@RequestParam(value = "productId",required = false)String productId,
                             Map<String ,Object> map){
        if (!StringUtils.isEmpty(productId)){
            //修改
            ProductInfo productInfo=productService.findOne(productId);
            map.put("productInfo",productInfo);
        }
        //查询类目并且返回
        List<ProductCategory> categoryList=categoryService.findAll();
        map.put("categoryList",categoryList);
        return new ModelAndView("product/index");
    }

    @PostMapping("/save")
    public ModelAndView save(@Valid ProductForm form,
                             BindingResult bindingResult,
                             Map<String,Object> map){
        if (bindingResult.hasErrors()){
            //返回错误页面
            map.put("msg",bindingResult.getFieldError().getDefaultMessage());
            map.put("url","/seller/product/index");
            return new ModelAndView("common/error");
        }
        ProductInfo productInfo=new ProductInfo();
        try{
            if (!StringUtils.isEmpty(form.getProductId())){
                //有id 修改
                productInfo=productService.findOne(form.getProductId());
            }else {
                //新增加  生成一个id
                form.setProductId(KeyUtil.genUniqueKey());
            }

            BeanUtils.copyProperties(form,productInfo);
            productService.save(productInfo);
        }catch (SellException exception){
            map.put("msg",exception.getMessage());
            map.put("url","/seller/product/index");
            return new ModelAndView("common/error",map);
        }
        map.put("url","seller/product/list");
        return new ModelAndView("common/success",map);

    }
}
