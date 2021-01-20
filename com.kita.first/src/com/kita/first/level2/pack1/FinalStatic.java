package com.kita.first.level2.pack1;

public final class FinalStatic {//final class -> 상속 불가
	final int N1;
	static final int N2 = 2;
	static int n3 = 1;
	
	FinalStatic(int n1, int n2) {
		this.N1 = n1;
		printNum(n1); //생성자 안에 메소드를 넣을 수 있음
		n3 = n2;
	}
	
	static final void printNum(int input) { //static이면 객체를 생성하지 않고도 사용 가능 -> FinalStatic.printNum(1);
		System.out.println(input);
		System.out.println(n3); //n3가 static이기 때문에 가능
	} //메소드에 final -> 오버라이드 불가
	
	void call() {
		System.out.println("안녕");
	}
	
}
