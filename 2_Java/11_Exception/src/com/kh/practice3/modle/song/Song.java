package com.kh.practice3.modle.song;

public class Song {
	
	private String Song;
	private String Singer;
	public String getSong() {
		return Song;
	}
	public void setSong(String song) {
		Song = song;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public Song(String song, String singer) {
		super();
		Song = song;
		Singer = singer;
	}
	private String Smallgirl;
	private String Supernova;
	private String HowSweet;
	private String 한페이지가될수있게;
	public Song() {
		super();
	}
	@Override
	public String toString() {
		return "Song [ Song=" + Song + ", Singer=" + Singer + ", Smallgirl=" + Smallgirl + ", Supernova="
				+ Supernova + ", HowSweet=" + HowSweet + ", 한페이지가될수있게=" + 한페이지가될수있게 + "]";
	}
	public String getSmallgirl() {
		return Smallgirl;
	}
	public void setSmallgirl(String smallgirl) {
		Smallgirl = smallgirl;
	}
	public String getSupernova() {
		return Supernova;
	}
	public void setSupernova(String supernova) {
		Supernova = supernova;
	}
	public String getHowSweet() {
		return HowSweet;
	}
	public void setHowSweet(String howSweet) {
		HowSweet = howSweet;
	}
	public String get한페이지가될수있게() {
		return 한페이지가될수있게;
	}
	public void set한페이지가될수있게(String 한페이지가될수있게) {
		this.한페이지가될수있게 = 한페이지가될수있게;
	}
	public Song(String smallgirl, String supernova, String howSweet, String 한페이지가될수있게) {
		super();
		Smallgirl = smallgirl;
		Supernova = supernova;
		HowSweet = howSweet;
		this.한페이지가될수있게 = 한페이지가될수있게;
	}
}


