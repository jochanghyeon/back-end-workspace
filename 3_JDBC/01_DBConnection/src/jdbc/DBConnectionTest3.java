package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

import config.Serverinfo;

public class DBConnectionTest3 {
	
	
	public static void main(String[] args) {
		// 1. 드라이버 로딩
		try {
			Class.forName(Serverinfo.DRIVER_NAME);
		// 2. 디비 연결
			Connection conn = DriverManager.getConnection(Serverinfo.URL,Serverinfo.USER,Serverinfo.PASSWORD);
			String query = "UPDATE employee SET emp_name = ? WHERE  emp_id = ?";
		// 3. PreparedStatement - 쿼리 : UPDATE(emp_id 선택해서 emp_name 변경)
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1,"박성철");
			ps.setInt(2, 900);
			
			System.out.println(ps.executeUpdate() + "명 수정!");
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}