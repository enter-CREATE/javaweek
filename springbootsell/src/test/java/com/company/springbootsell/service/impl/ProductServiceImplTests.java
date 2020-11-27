package com.company.springbootsell.service.impl;

import com.company.springbootsell.dataobject.ProductInfo;
import com.company.springbootsell.services.impl.ProductServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ProductServiceImplTests {
    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findone(){
        ProductInfo productInfo=productService.findOne("123");
        Assert.assertEquals("123",productInfo.getProductId());
    }
}
