package com.kh.overriding.model;

import java.util.Objects;

import com.kh.inheritance.parent.Product;

/*
 * 클래스 간의 관계 : 상속 vs 포함
 * - 상속 관계 : ~은 ~ 이다. (is - a)
 * - 포함 관계 : ~은 ~을 가지고있다. (has - a)
 * - 자바는 단일상속만 허용
 * - 클래스 간의 관계를 많이 맺을수록 재사용을 높히고 관리하기 쉽게 한다.
 * */

public class Customer {
	
	protected String name; //고객 이름
	protected String grade; // 고객 등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; // 보너스 적립 비율
	
	Product product; // 포함 관계
	
	
	public Customer() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String name, String grade, int bonusPoint, double bonusRatio) {
		super();
		this.name = name;
		this.grade = "SILVER";
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	@Override
	public String toString() {
		return "Customer [~님의 등급은 "+ name +" 이며, 지불해야되는 금액은"+ grade+ " 원이며, 적립된 포인트는" + bonusPoint +" 점입니다.]";
	}

	@Override // <-- 어노테이션! '이 메서드는 재정의된 메서드이다.' 라고 명확히 알려주는 역할
	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		return c.name == this.name;
		
	}
	public int calcPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return price ;

			
		}
	}

	
