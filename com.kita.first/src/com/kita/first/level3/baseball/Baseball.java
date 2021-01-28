package com.kita.first.level3.baseball;

public class Baseball { //랜덤 숫자 뽑기 클래스
	private int[] rArr;
	int max = 9;
	int min = 1;
	
	public Baseball(int len) {
		rArr = new int[len];
		setRandom();
	}
	
	private void setRandom() {
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random()*(max-min+1))+min;
			for(int j=0; j<i; j++) {
				if(rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public int getRandom(int idx) {
		return rArr[idx];
	}
	
//	public Baseball(int len) { //생성자는 public
//		init(len); //메소드는 private
//	}
	
}
