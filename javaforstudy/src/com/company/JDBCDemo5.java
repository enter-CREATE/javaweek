package com.company;

import com.company.domain.Emp;

import java.sql.*;

public class JDBCDemo5 {
    public static void main(String[] args) throws Exception{
//        1、导入驱动jar包, 建立libs文件夹， 右键 add as library
//        2、 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
//        3、获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jiangkeda","root","123456");
//        4、定义sql
        String sql="select * from emp";
//        5、获取数据库连接对象statement
        Statement stmt=conn.createStatement();
//        6、执行sql
        ResultSet rs=stmt.executeQuery(sql);
//        7、处理结果
//        while (rs.next()) {
//            int empno = rs.getInt("1");
//            String ename=rs.getString("2");
//            String job=rs.getString("3");
//            int mgr = rs.getInt("4");
//            Date hiredate=rs.getDate("5");
//            int sal = rs.getInt("6");
//            int comm = rs.getInt("7");
//            int deptno = rs.getInt("8");
//            System.out.println(empno+"----"+ename+"----"+
//                    "----"+job+"----"+mgr+"----"+
//                    hiredate+"----"+sal+"----"+
//                    comm+"----"+deptno);
//        }
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
            System.out.println(emp);
        }
//        8、释放资源
        stmt.close();
        conn.close();
    }

}
