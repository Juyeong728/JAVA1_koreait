package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 자판기 게임
		// 메뉴 : 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
		// 가격 : 900, 700, 400, 500, 600, 1000
		
		String[] menuArr = {"콜라", "사이다", "캔커피", "데자와", "환타", "웰치스"};
		int[] priceArr = {900, 700, 400, 500, 600, 1000};
		
//		int len = 6;
//		Menu menu = new Menu(len);
		
		//메뉴, 가격 배열에 값 입력
		
		
		//메뉴 찍기 기능
		System.out.println("---메뉴---");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		int num;
		int total = 0;
		
		//0입력시까지 반복되는 반복문
		while(true) {
			//번호 입력받는 기능
			System.out.print("메뉴를 입력하세요(0입력시 종료): ");
			num = scan.nextInt();
			//입력받은 번호 분기 가르기 기능
			if(num>6 || num<0) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if(num==0) { 
				break;
			}
			//입력받은 번호의 음료 내용 프린트 기능
			System.out.printf("%s %d원\n", menuArr[num-1], priceArr[num-1]);
			//합계 합산 기능
			total += priceArr[num-1];
		}
		//합계 찍어주는 기능
		System.out.printf("총 합계: %d원", total);
		
		scan.close();
		
	}
}
