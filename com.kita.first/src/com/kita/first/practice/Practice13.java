package com.kita.first.practice;

public class Practice13 {
	public static void main(String[] args) {
		// 2~9단 세로로
		// 단이 하나 바뀔 때 추가로 개행
		
		for(int dan=2; dan<10; dan++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			System.out.println();
		}
		
	}
}
