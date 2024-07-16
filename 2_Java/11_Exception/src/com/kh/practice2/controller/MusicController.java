package com.kh.practice2.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice2.compare.ArtistDescending;
import com.kh.practice2.compare.SongAscending;
import com.kh.practice2.model.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();

	
		// 1마지막 위치에 곡 추가
		public boolean addLastList(Music music) {
			if(!music.getArtist().equals("") && !music.getSong().equals("")) {
				list.add(music);
			}
			return false;
		}
		
		// 2
		public boolean addFirstList(Music music) {
			if(!music.getArtist().equals("") && !music.getSong().equals("")) {
			list.add(0, music);
			return true;
		}
		return false;
			}
		// 3
		public ArrayList<Music> printAll() {
			return list;

		}
		// 4
		public Music searchMusic(String song) {
			for(Music music : list) {
				if(music.getSong().contains(song)) {
					return music;
				}
			}
			return null;
		}
		
		public Music removeMusic(String song) {
			for(Music music : list) {
				if(music.getSong().equals(song)) {
					return list.remove(list.indexOf(music));
				}
			}
			return null;
		}
		
		public Music updateMusic(String search, Music update) {
			for(Music music : list) {
				if(music.getSong().equals(search)) {
				return list.set(list.indexOf(music), update);
				}
			}
			return null;
	
		}
		public ArrayList<Music> descArtist() {
			ArrayList<Music> cloneList = (ArrayList<Music>) list.clone();
			Collections.sort(cloneList, new ArtistDescending());
			return cloneList;
			
		}
		public ArrayList<Music> ascSong() {
			ArrayList<Music> cloneList = (ArrayList<Music>) list.clone();
			Collections.sort(cloneList, new SongAscending());
			return cloneList;

	}
}
