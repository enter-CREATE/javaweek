package com.company;

import com.company.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("欢迎来到死亡峡谷");
        System.out.println("请输入用户名");
        String Name=scanner.next();
        System.out.println("请输入密码");
        String password=scanner.next();

        boolean flag=login(Name,password);
        if (flag) {
            System.out.println("即将开启自闭模式,请稍等");
        }else {
            System.out.println("请重新登录！");
        }
    }

    /**
     * 用户登录
     * @param Name
     * @param password
     * @return
     */
    public static boolean login(String Name,String password) {

        if (Name==null||password==null){
            return false;
        }
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
            conn = JDBCUtils.getConnection();
            String sql="select * from user where name='"+Name+"' and password='"+password+"' ";
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
