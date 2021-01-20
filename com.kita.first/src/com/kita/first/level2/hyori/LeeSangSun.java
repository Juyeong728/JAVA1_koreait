package com.kita.first.level2.hyori;

public class LeeSangSun extends LeeHyoRi {
	LeeSangSun() {
		super("인스타");
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸";
		hr.sns = "인스타";
//		hr.star = 100; //클래스가 다름
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타");
//		LeeHyoRi hr3 = new LeeHyoRi(100); //클래스가 다름
		hr2.sing();
		
		hr.sing();
		hr.drinkTea();
//		hr.dance(); //클래스가 다름
	}
}
