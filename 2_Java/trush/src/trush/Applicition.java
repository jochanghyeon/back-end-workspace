package trush;

import java.util.Scanner;

import trush.controller.BookController;

import trush.model.Book;

public class Applicition {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	Book[] books = {new Book("밥을 지어요", true, 0), 
				new Book("오늘은 아무래도 덮밥", false, 0), 
				new Book("원피스 108", false, 15), 
				new Book("귀멸의 칼날 23", false, 19)};
	
	public static void main(String[] args) {

	}

}
