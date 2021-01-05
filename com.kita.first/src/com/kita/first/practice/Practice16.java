package com.kita.first.practice;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		// 1~6까지 랜덤으로 메뉴 뽑기를 한 번 한 후에
		// 뽑힌 메뉴: ㅇㅇ
		// 마음에 들면 Y 눌러서 반복 끝내고
		// "오늘의 메뉴는 ㅇㅇ입니다."
		// 마음에 안 들면 다시 랜덤 뽑기
		
		Scanner scan = new Scanner(System.in);
		String menu;
		boolean again = true;
		
		do {
			int rNum = (int)(Math.random()*6)+1; 
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
			System.out.printf("뽑힌 메뉴: %s\n", menu);
			System.out.print("마음에 듭니까? (Y/N) ");
			String result = scan.next();
			if("Y".equals(result)) {
				break;
			}
		} while(again);
		System.out.printf("오늘의 메뉴는 %s입니다.", menu);
		
		scan.close();
	}
}
