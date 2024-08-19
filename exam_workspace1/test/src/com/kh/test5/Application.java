package com.kh.test5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.test4.Fruit;
import com.kh.test5.model.food.Food;

public class Application {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Food> list= new ArrayList<>();
		while(true) {
		System.out.println("=== 음식 메뉴 리스트 ===");
		System.out.println("1. 음식 추가");
		System.out.println("2. 음식 정보");
		System.out.println("3. 음식 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("번호선택 : ");
		
		int number =Integer.parseInt(sc.nextLine());
		
		if(number ==1 ) {
			System.out.println("추가할 음식 입력 :");
			for(int i=0; i<list.size();i++ ) {
//				int kcal
			}
			System.out.println("칼로리 입력");
			
			System.out.println("음식 정보가 추가 되었습니다.");
		}else if(number ==2) {
			for() {Food food
				
			}
			
		}else if(number ==3) {
			for(int delete
			System.out.println("삭제하고 싶은 음식 선택 :");
			
			System.out.println(Food +"가 삭제되었습니다.");
			
		}else if(number ==4) {
			break;	
		}
	}
	}
	
}
