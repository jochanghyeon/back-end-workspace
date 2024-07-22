package com.kh.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.RentDAO;

public class RentController {

	private RentDAO rent = new RentDAO();
	// 1. 책 대여
		public boolean rentBook(int memberNo, int bookNo) {
			
			// printBookAll 메서드 호출하여 전체 책 조회 출력 후
			// 대여할 책 번호 선택을 사용자한테 입력 받아
			// 대여에 성공하면 "성공적으로 책을 대여했습니다." 출력
			// 대여에 성공하면 "성공적으로 책을 대여했습니다." 출력
			// 이미 대여된 책은 대여 불가!
			try {
				if(rent.checkRentBook(bookNo)) {
					// 이미 대여된 책이 없으면 대여 가능!
					rent.rentBook(memberNo, bookNo);
					return true;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
		}
		
		
		// 2. 내가 대여한 책 조회
		public ArrayList<Rent> printRentBook(int memberNo) {
			
			rent.printRentBook(memberNo);
			
			return null;
			
			public void deleteRent() {
				// printRentBook 매서드 호출하여 내가 대여한 책 조회 출력 후
				printRentBook();
			
		}
			// 3. 대여 취소
			public boolean deleteRent(int no) {
				if(rent.deleteRent(no) == 1 )return true;
				return false;
				

	
}
