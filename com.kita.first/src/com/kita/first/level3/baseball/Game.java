package com.kita.first.level3.baseball;

public class Game { //실행 클래스
	public static void main(String[] args) {
		int len = 3;
		
		Baseball ball = new Baseball(len);
		MyBall myBall = new MyBall(len);
		
		System.out.println("숫자야구게임 시작!");
		do {
//			myBall.setNumbers();
		} while(Checker.check(len, ball, myBall));
		
		System.out.println("숫자야구게임 종료!");
		
	}
}
