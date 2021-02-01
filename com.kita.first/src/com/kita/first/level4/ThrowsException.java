package com.kita.first.level4;

import java.util.Scanner;

public class ThrowsException {
	Scanner scan = new Scanner(System.in);
	
	void method() throws Exception {
		
	}
	
	void method1() {
		try {
			
		} catch(NumberFormatException e) {
			
		} catch(NullPointerException e) { //catch로 예외를 여러 개 걸 수 있음
			
		} catch(Exception e) { //모든 예외를 잡기 위해 제일 마지막에 걸어줌
			
		} finally {
			
		}
	}
	
	void parseInputStrToInt() throws Exception {
		System.out.print("숫자를 입력해주세요: ");
		String str = scan.next();
		int num = 0;
		try {
			num = Integer.parseInt(str);
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("문자가 섞였습니다. 다시 입력해주세요.");
		} catch(NullPointerException e) {
			System.out.println("주소값이 연결되어 있지 않습니다.");
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다.");
			num = 0;
		} finally {
			
		}
	}
	
}
