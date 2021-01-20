package com.kita.first.level2.pack1;

public class Singleton {
	private static Singleton sg = null; //Singleton -> 단 하나의 객체만 만들 수 있게 한다
										//private -> 클래스 내부에서만
										//new 객체 생성을 막음
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() { //메소드에 public
											//static -> 미리 메모리에 올려놓음 (객체, 인스턴스 없이 사용)
		if(sg == null) {
			sg = new Singleton(); //sg에 주소값이 연결됨
		}
		return sg;
	}
	
}
