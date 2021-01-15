package com.kita.first.level2;

public class PhoneTest { //실행 클래스
	public static void main(String[] args) {
		Phone myPhone = new Phone("갤럭시 S21", "노란색", 300);
		System.out.println(myPhone.name); // myPhone(객체)의 name(필드)
		
		Phone yourPhone = new Phone("갤럭시 노트20", "빨간색", 250);
		System.out.println(yourPhone.name);
		
		Phone phone1 = new Phone();
		System.out.println(phone1.name);
		
		Phone phone2 = new Phone("갤럭시 A80");
		System.out.println(phone2.name);
		System.out.println(phone2.color);
		System.out.println(phone2.memory);
	}
}
