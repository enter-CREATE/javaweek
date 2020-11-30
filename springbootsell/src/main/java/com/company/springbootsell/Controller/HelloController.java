package com.company.springbootsell.Controller;

import com.company.springbootsell.dataobject.ProductCategory;
import com.company.springbootsell.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/")
    public List<ProductCategory> hello(){
        List<ProductCategory> list=categoryService.findAll();
        for (ProductCategory p:list) {
            System.out.println(p);
        }
        return list;
    }
}
