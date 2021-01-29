package com.kita.first.level4;

public class MusicPlayer implements AkmuAlbum, IUAlbum { //인터페이스는 클래스와 달리 다중상속 가능
	@Override
	public void playAkmuAlbum() { //부모의 접근제한자보다 크게는 가능, 작게는 불가능
		System.out.println("항해 앨범을 재생합니다.");
	}
	
	@Override
	public void stopAkmuAlbum() { //반드시 재정의가 되어야함 
		System.out.println("항해 앨범을 재생합니다.");
	}
	
	@Override
	public void playIUAlbum() { 
		System.out.println("셀러브리티 앨범을 재생합니다.");
	}
	
	@Override
	public void stopIUAlbum() { 
		System.out.println("셀러브리티 앨범을 재생합니다.");
	}
	
	public void playMichealJacksonAlbum() { 
		System.out.println("Beat it! 앨범을 재생합니다.");
	}
	
}
