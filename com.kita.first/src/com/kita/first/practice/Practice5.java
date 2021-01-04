package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수학 응시 유형을 입력해 주세요: (가/나)");
		String type = scan.next();
		
		String result = "평균";
		int defaultScore = 70;
		
		if("가".equals(type) || "나".equals(type)) {
			
			System.out.println("점수를 입력해 주세요: ");
			int score = scan.nextInt();
			
			if("가".equals(type)) {
				defaultScore = 60;
			}
			if(score < defaultScore) {
				System.out.println("평균 미만입니다.");
			} else if(score > defaultScore) {
				System.out.println("평균 초과입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scan.close();
	}
}
