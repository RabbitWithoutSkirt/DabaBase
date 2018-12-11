package com.utils;

import java.sql.*;

public class database {
    public static Connection conn(){
        //定义地址
        String url="jdbc:mysql://localhost:3306/spatialdatabase?useSSL=false&useUnicode=yes&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&serverTimezone=UTC";
        String userName = "root";
        String password = "123456";
        //定义连接初始值
        Connection connection=null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //建立连接
            connection=DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
