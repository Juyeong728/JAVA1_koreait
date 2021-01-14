package com.kita.first.level2.practice2;

public class Practice02 {
	public static void main(String[] args) {
		int num1 = sum(5, 6);
		int num2 = minus(4, 7);
		int num3 = multiply(num1, num2);
		double num4 = divide(5, 3);
		int num5 = sum(5, 6, 7);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}
	
	static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	static int sum(int n1, int n2, int n3) { // 오버로딩
		int result = n1 + n2 + n3;
		return result;
	}
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	static double divide(int n1, int n2) {
		double result = (double) n1 / n2;
		return result;
	}
	
}
