package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author majiabao on 2018/2/1.
 */
public class LisSimpleConnect {
    public static void main(String[] args) throws SQLException {
        String driverName = "oracle.jdbc.driver.OracleDriver";   //加载JDBC驱动
        String dbURL = "jdbc:oracle:thin:@10.0.34.12:1521:orcl";   //连接服务器和数据库test
        String userName = "lis_interface";   //默认用户名
        String userPwd = "lis";   //密码
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(dbURL, userName, userPwd);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }


    }
}
