package com.kita.first.practice;

import java.util.Scanner;

public class Practice25 {
	public static void main(String[] args) {
		// 자판기 게임
		// 메뉴 : 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
		// 가격 : 900, 700, 400, 500, 600, 1000
		
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		
		System.out.println("---메뉴---");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		int num;
		int total = 0;
		
		while(true) {
			System.out.print("메뉴를 입력하세요(0입력시 종료): ");
			num = scan.nextInt();
			if(num>6 || num<0) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if(num==0) {
				System.out.printf("총 합계: %d원", total);
				break;
			}
			System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
			total += priceArr[num-1];
		}
		
		scan.close();
		
	}
}
