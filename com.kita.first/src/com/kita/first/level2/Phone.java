package com.kita.first.level2;

// 파일명과 이름이 같은 클래스만 접근 제한자(public)가 붙을 수 있다.
public class Phone { //라이브러리 클래스
	// 필드(속성)
	String company = "삼성";
	String name;
	String color;
	int memory;
	
	// 생성자 : 필드(변수)를 초기화
	Phone(String name, String color, int memory) { 
		//필드 초기화
		this.name = name; //this는 Phone객체를 가르킴(this.name : Phone의 name)
		this.color = color;
		this.memory = memory;
	}
	
	Phone(String name, String color) {
		this(name, color, 200);
	}
	
	Phone(String name) {
		this(name, "검은색", 200); //매개변수가 3개인 생성자를 호출(생성자의 맨 첫 번째 줄에서만 사용 가능)
	}
	
	Phone() {}; //컴파일러가 소스코드 돌릴 때, 따로 정의한 생성자가 없을 시 기본 생성자를 만들어줌
	
	// 메소드
	String sendMsg(String str) {
		String result = str;
		if("".equals(str)) {
			String blank = "";
			result = blank;
		}
		return result;
	}
	void call() {
		
	}
	
} // 설계도(클래스)로 만든 객체 = 인스턴스
