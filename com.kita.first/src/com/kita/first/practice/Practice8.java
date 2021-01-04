package com.kita.first.practice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 월인지 입력해주세요 : (1~12월)");
		int month = scan.nextInt();
		// int monthNum = Integer.parseInt(month);
		
		String season;
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default:
			season = "겨울";
		}
		System.out.printf("%d월은 %s입니다.\n", month, season);
		
		
		if(month >= 3 && month <= 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "겨울";
		}
		System.out.printf("%d월은 %s입니다.\n", month, season);

		scan.close();
	}

}
