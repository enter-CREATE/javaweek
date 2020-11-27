package com.company.springbootsell.service.impl;

import com.company.springbootsell.dataobject.ProductInfo;
import com.company.springbootsell.services.impl.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTests {
    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne(){
        ProductInfo productInfo=productService.findOne("123");
        Assert.assertEquals("123",productInfo.getProductId());
    }
}
