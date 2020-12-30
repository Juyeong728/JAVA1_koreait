package com.kita.first;

import java.util.Scanner; //java.util package의 Scanner 클래스

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(num);
		
		String str = scan.next();
		System.out.println(str);
		
		scan.close();
	}
}
