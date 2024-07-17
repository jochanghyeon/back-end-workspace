package jdbc;import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.ha.ServerAffinityStrategy;

import config.Serverinfo;

public class DBConnectionTest4 {
	public static void main(String[] args) {
		
		try {
			
			Properties p = new Properties();
			p.load(new FileInputStream("src/config/jdbc.properties"));
			
			// 1. 드라이버 로딩
			Class.forName(Serverinfo.DRIVER_NAME);
			
			// 2. DB 연결
			Connection conn = DriverManager.getConnection(Serverinfo.URL, Serverinfo.USER,Serverinfo.PASSWORD);
			
			// 3. PreparedStatement - DELETE (emp_id로 삭제)
			String query = p.getProperty("delete");
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1,300);
			
			// 4. 쿼리문 실행
			System.out.println(ps.executeUpdate() + "명 삭제..!");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
