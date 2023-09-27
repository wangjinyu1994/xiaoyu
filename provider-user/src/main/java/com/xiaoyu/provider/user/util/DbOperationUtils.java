package com.xiaoyu.provider.user.util;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * WJY
 */
public class DbOperationUtils {

    /**
     * 数据库连接需要的字符串
     * */
    public static final String username = "root";
    public static final String password = "WangJinYu1994@";
    public static final String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/xiaoyu?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false&allowMultiQueries=true";
    public static final String driverName = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {

        Connection conn = null;

        Class.forName(driverName);
        //连接mysql
        conn = DriverManager.getConnection(jdbcUrl, username, password);
        return conn;
    }


}
