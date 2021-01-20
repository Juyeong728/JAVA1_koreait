package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class HwaSa extends LeeHyoRi {
	public HwaSa() {
		super("인스타"); //부모 클래스의 생성자
		this.music = "";
		this.sns = "";
//		this.star = 12;
		
		drinkTea();
		this.drinkTea(); //본인
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
//		hr.sns = "인스타"; //패키지가 다름
//		hr.star = 100; //클래스가 다름
		
//		LeeHyoRi hr2 = new LeeHyoRi("인스타"); // 패키지가 다름
//		LeeHyoRi hr3 = new LeeHyoRi(100); //클래스가 다름
		
		hr.sing();
//		hr.drinkTea(); // 패키지가 다름
//		hr.dance(); //클래스가 다름
	}
}
