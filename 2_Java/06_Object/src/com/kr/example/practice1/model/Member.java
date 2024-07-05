package com.kr.example.practice1.model;

public class Member {

	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	// private 은 같은 클레스 내에서
	// public 다른 패키지에 있는 곳에서도 접근가능
	public Member() {}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
		
	}
	
}
