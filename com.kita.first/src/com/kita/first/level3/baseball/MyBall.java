package com.kita.first.level3.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class MyBall { //내가 숫자 입력하고 예외 처리하는 클래스
	private int[] myArr;
	int max = 9;
	int min = 1;
	private Scanner scan;
	
	public MyBall(int len) {
		init(len);
	}
	
	private void init(int len) {
		myArr = new int[len];
		scan = new Scanner(System.in);
	}
	
	//숫자를 입력받는 기능
	public void setNumbers() {
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("%d번째 숫자: ", i+1);
			String val = scan.next();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				i--;
				System.out.println("1~9까지의 숫자값을 입력해주세요.");
				continue;
			}
			
			if(myArr[i]>max || myArr[i]<min) {
				System.out.println("범위(1~9)밖의 숫자를 입력하셨습니다.");
				i--;
				continue;
			}
			
			for(int j=0; j<i; j++) {
				if(myArr[i]==myArr[j]) {
					i--;
					System.out.println("중복된 수를 입력하셨습니다.");
					break;
				}
			}
		}
		System.out.println(Arrays.toString(myArr));
	}
	
	public int getNumbers(int idx) {
		return myArr[idx];
	}
	
}
