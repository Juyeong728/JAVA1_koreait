package com.kita.first.level3.baseball;

public class Checker { //스트라이크, 볼 , 아웃 개수 확인하는 클래스
	
	public static boolean check(int len, Baseball ball, MyBall myBall) {
		int strikeCnt = 0;
		int ballCnt = 0;
		for(int i=0; i<len; i++) {
//			if(myArr[i]==rArr[i]){
//				strikeCnt++;
//				continue;
//			}
//			for(int j=0; j<len; j++) {
//				if(myArr[i]==rArr[j]) {
//					ballCnt++;
//				}
//			}
		}
		System.out.printf("S: %d, B: %d, O: %d\n", strikeCnt, ballCnt, len-(strikeCnt+ballCnt));
		if(strikeCnt==len) {
			System.out.println("End!");
			return false;
		}
		return true;
	}

}
