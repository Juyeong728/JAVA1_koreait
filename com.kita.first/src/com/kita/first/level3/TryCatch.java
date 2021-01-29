package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args) {
		String str = "123.45";
		int num1;
		double num2;
		
		try {
			num1 = Integer.parseInt(str);
			System.out.println(num1);
		} catch(Exception e) {
			e.printStackTrace();
			num2 = Double.parseDouble(str);
			System.out.println(num2);
		}
		
		
//		Animal animal = new Animal();
//		Cat cat = new Cat();
//		animal = cat;
		
		try {
//			Dog dog = (Dog)animal;
//			dog.barking();
		} catch(Exception e) {
			e.printStackTrace(); //에러가 나면 찍어줌
			System.out.println("문제 발생");
		} finally { 
			System.out.println("형변환 시도 종료");
		} //finally는  option
		
	}
}
