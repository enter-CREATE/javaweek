package com.company.dao;

import com.company.domain.Business;

import java.util.List;

public interface BusinessDao {
    // 所有商家列表
    public List<Business> listBusiness();
}
