package com.tan.ssm.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url ="jdbc:mysql://49.235.248.17:3306/ssm?characterEncoding=utf-8";
		String username="root";
		String password="Tan128505..";
		
		
		Connection connection = DriverManager.getConnection(url, username, password);
		String sql="select * from user";
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			String un = rs.getString(1);
			System.out.println(un);
			
		}
	}

}
