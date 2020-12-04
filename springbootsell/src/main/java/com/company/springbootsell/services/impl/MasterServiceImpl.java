package com.company.springbootsell.services.impl;

import com.company.springbootsell.dataobject.OrderMaster;
import com.company.springbootsell.repository.OrderMasterRepository;
import com.company.springbootsell.services.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterServiceImpl implements MasterService {
    @Autowired
    OrderMasterRepository repository;

    @Override
    public List<OrderMaster> findAll() {
        return repository.findAll();
    }

    @Override
    public void cancel(String orderId) {
        OrderMaster orderMaster=repository.findById(orderId).orElse(null);
        if (orderMaster.getOrderStatus()==0){
            orderMaster.setOrderStatus(1);
        }else {
            orderMaster.setOrderStatus(0);
        }
    }

    @Override
    public OrderMaster findById(String orderId) {
        return repository.findById(orderId).orElse(null);
    }
}
