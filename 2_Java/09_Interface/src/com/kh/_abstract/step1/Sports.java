package com.kh._abstract.step1;

public abstract class Sports {
	
	protected int numberOfplayers; //참여하는 사람 수

	public Sports(int numberOfplayers) {
		super();
		this.numberOfplayers = numberOfplayers;
	}

	// 추상메서드 -> 자식 클래스에서 무조건 재정의 해주어야 한다
	public abstract void rule();
		
		
	
	
	
}