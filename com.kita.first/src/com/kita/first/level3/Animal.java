package com.kita.first.level3;

public abstract class Animal { //abstract 추상클래스 -> 객체 찍어내기 불가능, 상속만 가능
	String name = "동물";
	
	Animal() {
		
	}
	
	abstract void crying();
	
//	void crying() {
//		System.out.println("동물이 운다.");
//	}
	
}
