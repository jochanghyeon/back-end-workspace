package com.kh._abstract.step1;

public class FootBall extends Sports {

	public FootBall(int numberOfplayers) {
		super(numberOfplayers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rule() {
		System.out.println("FootBall의 선수의 수는 " 
			+ this.numberOfplayers + "명 , 손이 아닌 발로 공을 차야 한다.");
	}

}
