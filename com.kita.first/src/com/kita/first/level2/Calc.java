package com.kita.first.level2;

public class Calc {
	// 필드
	
	// 생성자
	
	// 메소드
	public static void main(String[] args) {
		Calc myCalc = new Calc();
		myCalc.powerOn(); 
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		
		int num = myCalc.sum(7, 2); 
		System.out.println(num);
		
		int num2 = myCalc.minus(7, 2);
		System.out.println(num2);
		
		int num3 = myCalc.multiply(7, 2);
		System.out.println(num3);
		
		double num4 = myCalc.divide(7, 2);
		System.out.println(num4);
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public double divide(int n1, int n2) {
		double result = (double)n1 / n2;
		return result;
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
