package com.kh.controller;

import java.io.FileInputStream;
import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.model.Book;

import config.ServerInfo;

public class BookController {

	Properties p = new Properties();
	
public BookController() {
	
	
	try {
		p.load(new FileInputStream("src/config/jdbc.properties"));
		
		Class.forName(ServerInfo.DRIVER_NAME);
	
	
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static BookController instance;

public static BookController getInstance() {
	if(instance == null) instance = new BookController();
	return instance;
}
public Connection connect() throws SQLException {
	return DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER , ServerInfo.PASSWORD);
	}

public void close(PreparedStatement ps, Connection conn) throws SQLException {
	ps.close();
	conn.close();
	}
public void close(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException {
	rs.close();
	close(ps,conn);

}
public boolean idCheck(String id) throws SQLException {
	Connection conn =connect();
	PreparedStatement ps = conn.prepareStatement(p.getProperty("idCheck"));
	ps.setString(1,id);
	
	ResultSet rs = ps.executeQuery();
	String checkId = null;
	
	if(rs.next()) checkId = rs.getString("id");
	close(rs, ps, conn);
	
	if(checkId!=null) return true;
	return false;
}

//1. 전체 책 조회
	public void printBookAll() {
		// 반복문을 이용해서 책 리스트 출력
	}

	// 2. 책 등록
	public void registerBook() {
		// 책 제목, 책 저자를 사용자한테 입력 받아
		// 기존 제목, 저자 있으면 등록 안되게!
		// 등록에 성공하면 "성공적으로 책을 등록했습니다." 출력
		// 실패하면 "책을 등록하는데 실패했습니다." 출력
	}

	// 3. 책 삭제
	public void sellBook() {
		// printBookAll로 전체 책 조회를 한 후
		// 삭제할 책 번호 선택을 사용자한테 입력 받아
		// 삭제에 성공하면 "성공적으로 책을 삭제했습니다." 출력
		// 실패하면 "책을 삭제하는데 실패했습니다." 출력
	}

	// 4. 회원가입
	public boolean registerMember(Book b) throws SQLException {
		// 아이디, 비밀번호, 이름을 사용자한테 입력 받아
		// 회원가입에 성공하면 "성공적으로 회원가입을 완료하였습니다." 출력
		// 실패하면 "회원가입에 실패했습니다." 출력
		
		
		if(!idCheck(b.getid())) {
			Connection conn = connect();
			PreparedStatement ps = conn.prepareStatement(p.getProperty("signUp"));
			ps.setString(1, b.getid());
			ps.setString(2, b.getPassword());
			ps.setString(3, b.getName());
		
			ps.executeUpdate();
			close(ps, conn);
			return true;
		}
		
		return false;
		
	}		


	// 5. 로그인
	public void login() {
		// 아이디, 비밀번호를 사용자한테 입력 받아 
		// 로그인에 성공하면 "~~님, 환영합니다!" 출력 후 memberMenu() 호출
		// 로그인에 성공하면 "~~님, 환영합니다!" 출력 후
	}
	// 1. 책 대여
	public void rentBook() {
		// printBookAll 메서드 호출하여 전체 책 조회 출력 후
		// 대여할 책 번호 선택을 사용자한테 입력 받아
		// 대여에 성공하면 "성공적으로 책을 대여했습니다." 출력
		// 대여에 성공하면 "성공적으로 책을 대여했습니다." 출력
	}

	// 2. 내가 대여한 책 조회
	public void printRentBook() {
		// 내가 대여한 책들을 반복문을 이용하여 조회
		// 대여 번호, 책 제목, 책 저자, 대여 날짜, 반납 기한 조회
	}

	// 3. 대여 취소
	public boolean deleteRent(int no) {
		return 
		// printRentBook 매서드 호출하여 내가 대여한 책 조회 출력 후
		// 취소할 대여 번호 선택을 사용자한테 입력 받아
		// 취소에 성공하면 "성공적으로 대여를 취소했습니다." 출력
		// 실패하면 "대여를 취소하는데 실패했습니다." 출력
	}

	// 5. 회원탈퇴
	public int deleteMember() throws SQLException {
		Connection conn = connect();
		String query = "DELETE FROM member_no = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, memberNo);
		int result = ps.executeUpdate();
		close(ps, conn);

}
