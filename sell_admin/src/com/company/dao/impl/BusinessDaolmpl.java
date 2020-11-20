package com.company.dao.impl;

import com.company.dao.BusinessDao;
import com.company.domain.Business;
import com.company.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    @Override
    public int saveBusiness(String businessName) {
        int businessId = 0;
        // 希望插入一个商家的时候自动给一个默认密码
        String sql = "insert into business(businessName, password) values (?, '123') ";
        try {
            conn = JDBCUtils.getConnection();
            // 要设置返回自增长的键
            pst = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, businessName);
            pst.executeUpdate();
            // 同时获取自增长的id值  一行一列
            rs = pst.getGeneratedKeys();
            if (rs.next()){
                businessId= rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }

        return businessId;
    }

    /**
     * 删除商家
     * @param businessId 商家ID
     * @return 0 代表删除失败 1 代表删除成功
     */
    @Override
    public int removeBusiness(int businessId) {
        int result=0;
        String sql="delete from business where businessId=?";
        try {
           conn =JDBCUtils.getConnection();
           //开启事务
            conn.setAutoCommit(false);
           pst=conn.prepareStatement(sql);
           pst.setInt(1,businessId);
           result=pst.executeUpdate();
           conn.commit();
        } catch (Exception e) {
            result=0;

            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            e.printStackTrace();
        }finally {
            JDBCUtils.close(pst,conn);
        }

        return result;
    }

    @Override
    public int supdateBusiness(Business business) {
        return 0;
    }

    @Override
    public Business getBusinessById() {
        return null;
    }
}
