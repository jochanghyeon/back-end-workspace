package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.Application;
import com.kh.model.Member;

import config.Serverinfo;

public class MemberController {

		public MemberController() {
			try {
		// 1. 드라이버 로딩
				Class.forName(Serverinfo.DRIVER_NAME);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		// 고정적인 반복 -- DB 연결, 자원 반납 -> 공통적인 메서드 정의.. 메서드마다 호출해서 사용!
		
		// 2. DB 연결
		public Connection getConnect() throws SQLException {
			return DriverManager.getConnection(Serverinfo.URL,Serverinfo.USER,Serverinfo.PASSWORD);
		}
		
		// 5. 자원 반납
		public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
			ps.close();
			conn.close();
		}
		public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		rs.close();
		closeAll(ps,conn);
		}
	
	public int signUp(String id , String password, String name) throws SQLException {
		Connection conn= getConnect();
			
			String query = "INSERT INTO member(id,password,name) VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setString(3, name);
			
			int result= ps.executeUpdate();
			
			closeAll(ps, conn);
			
			return result;
		}

		// 회원가입 기능 구현! 
		// -> 아이디가 기존에 있는지 체크 여부!
		// -> member 테이블에 데이터 추가! 


	
	public void login() {

		// 로그인 기능 구현! 
		// -> member 테이블에서 id와 password로 멤버 정보 하나 가져오기!
		
	}
	
	public void changePassword() {

		// 비밀번호 바꾸기 기능 구현!
		// -> login 메서드 활용 후 사용자 이름이 null이 아니면 member 테이블에서 id로 새로운 패스워드로 변경

	}
	
	public void changeName() {

		// 이름 바꾸기 기능 구현!
		// -> member 테이블에서 id로 새로운 이름으로 변경 
		
	}
	
}









