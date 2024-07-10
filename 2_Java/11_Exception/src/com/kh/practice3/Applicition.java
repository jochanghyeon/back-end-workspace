package com.kh.practice3;

import java.util.Scanner;

import com.kh.practice3.modle.Singer;
import com.kh.practice3.modle.song.Song;

public class Applicition {
	
private Song so = new Song();
	private Singer si = new Singer();
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Applicition ap = new Applicition();
		
		boolean cehck = true;
		while(true) {
		int select = ap.mainMenu();
		switch(select){
		case 1 :
			ap.lastSong();
		break;
		case 2 :
			ap.firstSong();
		break;
		case 3 :
			ap.printAll();
		break;
		case 4 :
			ap.searchSong();
		break;
		case 5 :
			ap.songDelet();
		break;
		case 6 :
			ap.songUpdate();
		break;
		case 7 :
			ap.singerDown();
		break;
		case 8 :
			ap.singerUp();
		break;
		case 9 :
			System.out.println("종료");
		break;
	default :
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
		
		}		
	}
}
	
		
	public int mainMenu() {
	while(true){
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2.첫 위치에 곡 추가");
		System.out.println("3.전체 곡 목록 출력");
		System.out.println("4.특정 곡 검색");
		System.out.println("5.특정 곡 삭제");
		System.out.println("6.특정 곡 수정");
		System.out.println("7.가수 명 내림차순 정렬");
		System.out.println("8.곡 명 오름차순 정렬");
		System.out.println("9.종료");
		System.out.println("메뉴 번호 입력 : ");
		
	
	int select = Integer.parseInt(sc.nextLine());
	switch(select){
	case 1 :
		lastSong();
	break;
	case 2 :
		firstSong();
	break;
	case 3 :
		printAll();
	break;
	case 4 :
		searchSong();
	break;
	case 5 :
		songDelet();
	break;
	case 6 :
		songUpdate();
	break;
	case 7 :
		singerDown();
	break;
	case 8 :
		singerUp();
	break;
	case 9 :
		System.out.println("종료");
	break;
default :
	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
		}
	}	
}
	public void lastSong() {
	System.out.println("****** 마지막 위치에 곡 추가******");
	System.out.println("곡명 : ");
	String So =sc.nextLine();
	System.out.println("가수명 : ");
	String Singer =sc.nextLine();
	System.out.println("추가 성공");
	}
	

	public void firstSong() {
		System.out.println("****** 첫번째 위치에 곡 추가******");
		System.out.println("곡명 : ");
		String So =sc.nextLine();
		System.out.println("가수명 : ");
		String Singer =sc.nextLine();
		System.out.println("추가 성공");	
	}
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
	}
	public void searchSong() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("검색할 곡 명");
		System.out.println(/*  */"을 검색 했습니다.");
		
	}
	public void songDelet() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("삭제할 곡 명");
		System.out.println(/*  */"을 삭제 했습니다.");
		
	}
	public void songUpdate() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.println("검색할 곡 명 : ");
		System.out.println("수정할 곡 명 : ");
		System.out.println("수정할 가수 명 : ");
		int select = Integer.parseInt (sc.nextLine());
		switch(select) {
		case 1:
			System.out.println("검색할 곡 명 : ");
			String song = sc.nextLine();
			break;
		case 2:
			System.out.println("수정할 곡 명 : ");
			String so = sc.nextLine();
			break;
		case 3:
			System.out.println("수정할 가수 명 : ");
			String singer = sc.nextLine();
			break;
		}
			
	}
	public void singerDown() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
	}
	public void singerUp() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
	}
	
}



