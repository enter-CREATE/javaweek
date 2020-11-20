package com.company.dao.impl;

import com.company.dao.BusinessDao;
import com.company.domain.Business;
import com.company.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BusinessDaolmpl implements BusinessDao {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    @Override
    public List<Business> listBusiness() {
        ArrayList<Business> list = new ArrayList<>();
        String sql = "select * from business";
        try {
            conn = JDBCUtils.getConnection();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                Business business = new Business();
                String businessName = rs.getString(3);
                business.setBusinessName(businessName);
                list.add(business);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
