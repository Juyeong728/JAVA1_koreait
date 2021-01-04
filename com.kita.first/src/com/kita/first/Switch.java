package com.kita.first;

public class Switch {
	public static void main(String[] args) {
		// 1~6 메뉴 랜덤 뽑기
		int rNum = (int)(Math.random()*6)+1; 
				
		String menu;
		switch(rNum) {
		case 1: 
			menu = "피자";
			break;
		case 2: 
			menu = "치킨";
			break;
		case 3: 
			menu = "초밥";
			break;
		case 4:
			menu = "떡볶이";
			break;
		case 5: 
			menu = "파스타";
			break;
		default : 
			menu = "우거지 순대국밥";
		}
		System.out.printf("%s", menu);
	}
}
