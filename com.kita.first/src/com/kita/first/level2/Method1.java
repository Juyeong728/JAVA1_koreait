package com.kita.first.level2;

public class Method1 {
	/*
	void 메소드명(매개변수) {
		
	}
	
	리턴타입 메소드명(매개변수) {
		return 리턴타입 변수;
	}
	*/
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int num1 = sum(arr);
		int num2 = sum(1,2,7,9);
		
		System.out.println(num1);
		System.out.println(num2);
	}
	/*
	static int sum(int[] arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	*/
	static int sum(int... arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	static int sum(String str, int... arr) { // 오버로딩
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
}
