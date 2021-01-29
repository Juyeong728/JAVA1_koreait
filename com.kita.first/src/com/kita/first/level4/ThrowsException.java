package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	Scanner scan = new Scanner(System.in);
	
	void method() throws Exception {
//		int num = Integer.parseInt(scan.next());
	}
	
	void method1() {
		try {
			
		} catch(NullPointerException e) { //catch로 예외를 여러 개 걸 수 있음
			
		} catch(Exception e) { //모든 예외를 잡기 위해 제일 마지막에 걸어줌
			
		} finally {
			
		}
	}
	
}
