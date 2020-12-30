package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		
		String oddNum = "짝수";
		
		if(num % 2 == 1) {
			oddNum = "홀수";
		} 
		System.out.printf("%s입니다.\n", oddNum);
	}
}
