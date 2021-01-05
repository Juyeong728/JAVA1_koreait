package com.kita.first.practice;

public class Practice15 {
	public static void main(String[] args) {
		
		int star = 4;
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=star*star; i++) { // 별 개수 먼저 지정 star*star
			System.out.print("*");
			if(i%star==0) { // 배수일 경우 개행
				System.out.println();
			}
		}
		
		System.out.println();
		
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
