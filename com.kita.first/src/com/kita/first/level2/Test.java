package com.kita.first.level2;

import com.kita.first.level2.mamamoo.*; //*는 mamamoo안의 클래스 파일 전체를 뜻함

public class Test {
	public static void main(String[] args) {
//		com.kita.first.level2.pack1.Class1 c1 = new com.kita.first.level2.pack1.Class1();
//		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		
		HwaSa hs = new HwaSa(); //패키지가 다름
		System.out.println(hs.music);
		
		com.kita.first.level2.Car car1 = new com.kita.first.level2.Car(30);
//		car1.speed = 50; //private 접근 불가
		
		int car1Speed = car1.getSpeed();
		System.out.println(car1Speed);
		
		car1.setColor("검은색");
		String car1Color = car1.getColor();
		System.out.println(car1Color);
		
		car1.setColor("파란색");
		System.out.println(car1Color); //getter를 써주지 않으면 들어가지 않음
		
	}
}
