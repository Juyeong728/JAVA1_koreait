package com.kita.first.level3.baseball;

import java.util.Scanner;

public class MyBall { //내가 숫자 입력하고 예외 처리하는 클래스
	private int[] myArr;
	int max = 9;
	int min = 1;
	Scanner scan = new Scanner(System.in);
	
	public MyBall(int len) {
		init(len);
		setNumbers();
	}
	
	private void init(int len) {
		myArr = new int[len];
		scan = new Scanner(System.in);
	}
	
	private void setNumbers() {
		for(int i=0; i<myArr.length; i++) {
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
	}
	
	public int getNumbers(int idx) {
		return myArr[idx];
	}
	
}
