package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
		// 성적 평균 구하기
		//국어합계: ?, 평균: ?  00.0
		//수학합계: ?, 평균: ?  00.0
		//영어합계: ?, 평균: ?  00.0
		//전체합계: ?, 평균: ?  00.0
		
		int[][] arr = {
				{90, 100, 88}, //국어
				{34, 99, 45}, //수학
				{89, 65, 74} //영어
		};
		
		String[] clsArr = {"국어", "수학", "영어"};
		int[] sumArr = new int[clsArr.length];
		int totalSum = 0;
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sumArr[i] += arr[i][j];
				totalSum += arr[i][j];
				cnt++; //cnt += arr[i].length;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], (double)sumArr[i]/arr[i].length);
		}
		System.out.printf("전체합계: %d, 평균 : %.1f\n", totalSum, (double)totalSum/cnt);
		
	}
}
