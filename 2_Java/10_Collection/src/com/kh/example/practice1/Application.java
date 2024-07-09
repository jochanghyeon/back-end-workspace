package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

import com.kh.example.practice1.model.lotto;


public class Application {
	
	
Random random =new Random();
	
		

		
	
	
	public void method1() {
		ArrayList list = new ArrayList(); 
		list.add(4);
		list.add(28);
		list.add(35);
		list.add(39);
		list.add(44);
		list.add(45);
		
		int num = 0;
		int random = (int) (Math.random() * 45 +1);	
		int count = 0;
		System.out.println(random);
		while(true) {
			System.out.println("로또 번호" + list);
			for(int i =0; i <=45; ++i)
			System.out.print(random);
			}

			
		}
	
	public static void main(String[] args) {
		Application ap = new Application();
		lotto lo = new lotto();
		ap.method1();
		
	
	
	
	}
	}
	
		
	


