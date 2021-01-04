package com.kita.first.practice;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		/*
		점수를 입력해 주세요: (0~100)
		90점 이상 A
		80점 이상 B
		70점 이상 C
		나머지는 D입니다. ( +, - 없다) 
		 		
		100 초과면 잘못 입력하였습니다.

		일의 자리 수가 7점 이상이면 +
		일의 자리 수가 3점 이하이면 -
		 		
		예를 들어, 95점: A, 97점: A+, 83점: B-
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요 : (0~100)");
		int score = scan.nextInt();
		
		if (score > 100 || score < 0){
			System.out.println("잘못 입력하셨습니다.");
			return; // 메소드를 종료
		} else if(score>=90){
			System.out.print("A");
		} else if (score >= 80){
			System.out.print("B");
		} else if (score >= 70){
			System.out.print("C");
		} else {
			System.out.print("D");
		}
		
		if(score == 100) {
			System.out.print("+");
		} else if(score >= 70 && score <= 100) {
			int mod = score & 10;
			
			if(mod >= 7) {
				System.out.print("+");
			} else if(mod <= 3) {
				System.out.print("-");
			}
		}
		
		scan.close();
	}
}
