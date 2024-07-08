package com.kh.array.practice2.model;

public class Member {
	
	public String id;
	private String name;
	private String pwd;
	private String email;
	private char gender;
	public Member(String id, String name, String pwd, String email, char gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", pwd=" + pwd + ", email=" + email + ", gender=" + gender
				+ ", age=" + age + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int age;
	public static void add(String id2, String name2) {
	}

	/* 생성자 2 개 게터세터 사용*/
}
