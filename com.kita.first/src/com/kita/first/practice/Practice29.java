package com.kita.first.practice;

import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
		// 숫자야구게임 시작!
		// 값1: 1
		// 값2: 2
		// 값3: 3
		// S: 0 / B: 1 / O: 2
		// 맞추면 S: 3 / B: 0 / O: 0
		// End!하고 종료
		
		Scanner scan = new Scanner(System.in);
		final int LEN = 3;
		int[] rArr = new int[LEN];
		int[] myArr = new int[LEN];
		
		int max = 9;
		int min = 1;
		
		for(int i=0; i<LEN; i++) {
			rArr[i] = (int)(Math.random()*(max-min+1))+min;
			for(int j=0; j<i; j++) {
				if(rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		
		int strike = 0;
		int ball = 0;
		
		System.out.println("숫자야구게임 시작!");
		while(true) {
			
			strike = 0;
			ball = 0;
			
			for(int i=0; i<LEN; i++) {
				System.out.printf("값%d: ", i+1);
				myArr[i] = scan.nextInt();
				if(myArr[i]>max || myArr[i]<min) {
					System.out.println("범위(1~9)밖의 숫자를 입력하셨습니다.");
					i--;
					continue;
				}
				for(int j=0; j<i; j++) {
					if(myArr[i]==myArr[j]) {
						System.out.println("중복된 수를 입력하셨습니다.");
						i--;
						break;
					}
				}
			}
			
			for(int i=0; i<LEN; i++) {
				for(int j=0; j<LEN; j++) {
					if(myArr[i]==rArr[j]) {
						ball++;
					} 
				}
				if(myArr[i]==rArr[i]) {
					strike++;
					ball--;
				}
			}
			
			/*
			for(int i=0; i<LEN; i++) {
				if(myArr[i]==rArr[i]){
					strike++;
					continue;
				}
				for(int j=0; j<LEN; j++) {
					if(myArr[i]==rArr[j]) {
						ball++;
					} 
				}
			} 
			*/
			
			System.out.printf("S: %d, B: %d, O: %d\n", strike, ball, LEN-(strike+ball));
			if(strike==3) {
				System.out.println("End!");
				break;
			}
		}
		
		scan.close();
		
		
	}
}
