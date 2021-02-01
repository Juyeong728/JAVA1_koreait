package com.kita.first.level4;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent() {
			@Override
			void parentMethod() {
				System.out.println("자식객체입니다.");
			};
		};
		p.parentMethod();
		
		Child child = new Child();
		child.childMethod2(new Parent() {
			@Override
			void parentMethod() {};
		});
		
		
		
		ThrowsException2 te2 = new ThrowsException2();
		try {
			te2.method1();
		} catch(Exception e) {
			
		}
		
		
		
		AkmuAlbum album1 = new MusicPlayer(); //AkmuAlbum을 계승받은 MusicPlayer는 들어감
		IUAlbum album2 = new MusicPlayer();
		
		album1.playAkmuAlbum(); //playIUAlbum은 불가능
		album1.stopAkmuAlbum();
		
		album2.playIUAlbum();
		album2.stopIUAlbum();
		
		MusicPlayer myMP3 = (MusicPlayer)album1; //자식에게만 정의되어 있는 -> 강제 형변환
		myMP3.playMichealJacksonAlbum();
	}
}
