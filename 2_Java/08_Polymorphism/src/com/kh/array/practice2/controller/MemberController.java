package com.kh.array.practice2.controller;

import java.util.Arrays;

import com.kh.array.practice2.model.Member;


public class MemberController {

	private Member[] mArr =new Member[3];
	public int count = 0;
	
	Member member = new Member();
	

	public void insertMember(Member m) {
		mArr[count++] = new Member(m.getId(), m.getName(), m.getPwd(),
				m.getEmail(),m.getGender(), m.getAge());
		System.out.println(Arrays.toString(mArr));
	}
	// 맴버 아이디 검색
	public boolean checkId(String id) {
		for(int i = 0; i < mArr.length; i++) {
			if(mArr[i]!=null && mArr[i].getId().equals(id)) {
			// 기존 멤버 배열에 아이디가 있는 경우! =	
			}return false;
		}
		//아이디가 없는 경우
		return true;
	}
	
public void updateMember (String id,String name,String pwd,String email,char gender) {
	member.setId(id);
	member.setName(name);
	member.setPwd(pwd);
	member.setEmail(email);
	member.setGender(gender);
	

}
public void modify(String id) {
	member.setId(id);
}
public void modify1(String name) {
	member.setName(name);
}
public void modify2(String email) {
	member.setEmail(email);
}
public void modify3(String pwd) {
	member.setPwd(pwd);
}
public Member info() {
	return member;
} 

}