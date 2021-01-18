package com.kita.first.level2;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer(10, 10, 10, 10);
		Magician mag = new Magician(10, 20, 10, 10, 100);
		
		System.out.println(adv.intelligence);
		System.out.println(mag.intelligence);
//		System.out.println(adv.mp);
		System.out.println(mag.mp);
		
		//가장 가까운 메소드를 불러옴 (자기 파일 확인-> 부모 파일 확인)
		adv.attack();
		mag.attack();
//		adv.teleport();
		mag.teleport();
		mag.jump();
		
	}
}
