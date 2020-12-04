package com.company.springbootsell.services;

import com.company.springbootsell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailService extends JpaRepository<OrderDetail,String> {
    public OrderDetail findByOrderId(String orderId);
}
