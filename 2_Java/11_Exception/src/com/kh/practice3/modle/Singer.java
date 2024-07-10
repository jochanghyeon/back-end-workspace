package com.kh.practice3.modle;

public class Singer {

	
	
	private String 이영지;
	private String aespa;
	private String NewJeans;
	private String 데이식스;
	public Singer() {
		super();
		
	}
	@Override
	public String toString() {
		return "Singer [이영지=" + 이영지 + ", aespa=" + aespa + ", NewJeans=" + NewJeans + ", 데이식스=" + 데이식스 + "]";
	}
	public String get이영지() {
		return 이영지;
	}
	public void set이영지(String 이영지) {
		this.이영지 = 이영지;
	}
	public String getAespa() {
		return aespa;
	}
	public void setAespa(String aespa) {
		this.aespa = aespa;
	}
	public String getNewJeans() {
		return NewJeans;
	}
	public void setNewJeans(String newJeans) {
		NewJeans = newJeans;
	}
	public String get데이식스() {
		return 데이식스;
	}
	public void set데이식스(String 데이식스) {
		this.데이식스 = 데이식스;
	}
	public Singer(String 이영지, String aespa, String newJeans, String 데이식스) {
		super();
		this.이영지 = 이영지;
		this.aespa = aespa;
		NewJeans = newJeans;
		this.데이식스 = 데이식스;
	}
	
}
