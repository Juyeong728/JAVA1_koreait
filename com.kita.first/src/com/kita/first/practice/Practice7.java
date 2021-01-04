package com.kita.first.practice;

public class Practice7 {
	public static void main(String[] args) {
		// 1~6 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random()*6)+1; 
		
		String menu;
		if(rNum == 1) {
			menu = "피자";
		} else if(rNum == 2) {
			menu = "치킨";
		} else if(rNum == 3) {
			menu = "초밥";
		} else if(rNum == 4) {
			menu = "떡볶이";
		} else if(rNum == 5) {
			menu = "파스타";
		} else {
			menu = "우거지 순대국밥";
		}
		System.out.printf("%s", menu);
	}
}
