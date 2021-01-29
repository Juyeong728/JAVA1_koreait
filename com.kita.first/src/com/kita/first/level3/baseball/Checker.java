package com.kita.first.level3.baseball;

public class Checker { //스트라이크, 볼 , 아웃 개수 확인하는 클래스
	
	public static boolean check(int len, Baseball ball, MyBall myBall) {
		int strikeCnt = 0;
		int ballCnt = 0;
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) { 
				if(ball.getRandom(i)==myBall.getNumbers(j)) {
					if(i==j) {
						strikeCnt++;
					} else {
						ballCnt++;
					}
				}
			}
		}
		System.out.printf("S: %d, B: %d, O: %d\n", strikeCnt, ballCnt, len-(strikeCnt+ballCnt));
		boolean result = (strikeCnt != len);
		return result;
	}

}
