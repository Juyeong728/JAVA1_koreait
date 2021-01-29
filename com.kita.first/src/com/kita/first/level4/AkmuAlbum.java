package com.kita.first.level4;

public interface AkmuAlbum {
	//상수 필드
	String SONG_WRITER = "이찬혁"; //public static final은 자동
	int PRICE = 20_000;
	
	//추상메소드
	void playAkmuAlbum(); //public abstract은 자동
	void stopAkmuAlbum();
	
}
