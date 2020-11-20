package com.company;

import com.company.domain.Emp;
import com.company.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo6 {
    public static void main(String[] args) throws Exception{
//        List<Emp> empList=findAll();
        List<Emp> empList=findAll2();
        for (Emp e:empList) {
            System.out.println(e);
        }
    }
    public static List<Emp> findAll() throws Exception{
        List<Emp> list=new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jiangkeda","root","123456");
        String sql="select * from emp";
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);

        while (rs.next()) {
            int empno = rs.getInt(1);
            String eName = rs.getString(2);
            String job = rs.getString(3);
            int mgr = rs.getInt(4);
            Date hiredata = rs.getDate(5);
            int sal = rs.getInt(6);
            int comm = rs.getInt(7);
            int deptno = rs.getInt(8);
            Emp emp = new Emp(empno, eName, job, mgr, hiredata, sal, comm, deptno);
            list.add(emp);
        }
//        8、释放资源
        stmt.close();
        conn.close();
        return list;
    }

    public static List<Emp> findAll2() throws Exception {
        List<Emp> list=new ArrayList<>();
        Connection conn= JDBCUtils.getConnection();
        String sql="select * from emp";
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);

        while (rs.next()) {
            int empno = rs.getInt(1);
            String eName = rs.getString(2);
            String job = rs.getString(3);
            int mgr = rs.getInt(4);
            Date hiredata = rs.getDate(5);
            int sal = rs.getInt(6);
            int comm = rs.getInt(7);
            int deptno = rs.getInt(8);
            Emp emp = new Emp(empno, eName, job, mgr, hiredata, sal, comm, deptno);
            list.add(emp);
        }
        JDBCUtils.close(rs,stmt,conn);
        return list;
    }
    
}
