package com.company.springbootsell.repository;

import com.company.springbootsell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTests {

    @Autowired
    OrderMasterRepository repository;
    private final String OPENID = "32233";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("阿古朵");
        orderMaster.setBuyerPhone("13515949899");
        orderMaster.setBuyerAddress("东门");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal("6.4"));

        OrderMaster result = repository.save(orderMaster);
//        System.out.println(result);
        Assert.assertNotNull(result);
    }


}
