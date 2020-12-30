package com.kita.first.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수학 응시 유형을 입력해 주세요: (가/나)");
		String type = scan.next();
		
		System.out.println("점수를 입력해 주세요: ");
		int score = scan.nextInt();
		
		String result = "평균";
		if("가".equals(type)) {
			if(score < 60) {
				result = "평균 미만";
			} else if(score > 60) {
				result = "평균 초과";
			} 
		} else if("나".equals(type)) {
			if(score < 70) {
				result = "평균 미만";
			} else if(score > 70) {
				result = "평균 초과";
			} 
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.printf("%s입니다.", result);
		
		
		int defaultScore = 70;
		if("가".equals(type) || "나".equals(type)) {
			if("가".equals(type)) {
				defaultScore = 60;
			}
			if(score < defaultScore) {
				result = "평균 미만";
			} else if(score > defaultScore) {
				result = "평균 초과";
			} 
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.printf("%s입니다.", result);
		
		scan.close();
	}
}
