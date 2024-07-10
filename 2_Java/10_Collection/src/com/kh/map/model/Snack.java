package com.kh.map.model;
import com.kh.map.A_HashMap;
public class Snack extends A_HashMap {
	
	private String flavor;
	private int calorie;
	
	public Snack(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calorie=" + calorie + "]";
	}
}