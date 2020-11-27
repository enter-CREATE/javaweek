package com.company.springbootsell.services.impl;


import com.company.springbootsell.dataobject.ProductInfo;
import com.company.springbootsell.repository.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements com.company.springbootsell.services.ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return  repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return null;
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return null;
    }

    @Override
    public void increaseStock(String productId) {

    }

    @Override
    public void decreaseStock(String productId) {

    }
}
