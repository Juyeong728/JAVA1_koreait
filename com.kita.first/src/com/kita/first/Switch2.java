package com.kita.first;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sNum = scan.next();
		
		String menu;
		switch(sNum) {
		case "일":
			menu = "피자";
			break;
		case "이":
			menu = "치킨";
			break;
		case "삼":
			menu = "초밥";
			break;
		case "사":
			menu = "떡볶이";
			break;
		case "오":
			menu = "파스타";
			break;
		default :
			menu = "우거지 순대국밥";
		}
		System.out.printf("%s", menu);
		
		scan.close();
	}
}
