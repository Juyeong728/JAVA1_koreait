package com.kita.first.practice;

public class Practice20 {
	public static void main(String[] args) {
		// while문에 조건식을 사용하여
		// 1~100을 모두 더한 값이 출력되도록 하세요
		// 합계: 5050
		
		int i = 1;
		int max = 100;
		int sum = 0;
		
		while(i<=max) {
			sum += i;
			i++;
		}
		System.out.printf("합계: %d", sum);   
		
		/*
		while(i++<=max) {
			sum += i;
		}
		System.out.printf("합계: %d", sum);
		*/
		
	}
}
