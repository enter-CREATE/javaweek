package com.company;

import com.company.dao.impl.BusinessDaolmpl;
import com.company.domain.Business;

import java.util.List;


public class Test {
    public static void main(String[] args) {
//        BusinessDaolmpl dao = new BusinessDaolmpl();
//        List<Business> businessList = dao.listBusiness();
//        for(Business b : businessList){
//            System.out.println(b);
//        }
        BusinessDaolmpl dao = new BusinessDaolmpl();

//        int businessid = dao.saveBusiness("江科大食堂");
//        System.out.println("id" + businessid);
        dao.removeBusiness(10015);
    }
}
