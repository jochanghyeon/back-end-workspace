package com.kh.test6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwer1234");
		
		PreparedStatement st = conn.prepareStatement();
		
		SELECT * FROM employee WHERE empId and empName;
		ResultSet rs = st.executeQuery();
		
		while(rs) {
			System.out.println(rs.getString("empId")+ " /" + rs.getString("empName"));
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

