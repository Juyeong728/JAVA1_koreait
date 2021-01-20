package com.kita.first.level2.hyori;

public class LeeHyoRi {
	//필드
	public String music;
	protected String sns;
	private int star;
	
	//생성자
	public LeeHyoRi() {
		
	}
	
	protected LeeHyoRi(String sns) { //다른 패키지의 자식에게 상속 가능
		this.sns = sns;
	}
	
	private LeeHyoRi(int star) {
		this.star = star;
	}
	
	//메소드
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi(); //hr객체는 매개변수가 public
		hr.music = "유고걸";
		hr.sns = "인스타";
		hr.star = 100;
		
		LeeHyoRi hr2 = new LeeHyoRi("인스타"); //hr2객체는 매개변수가
		LeeHyoRi hr3 = new LeeHyoRi(100); //hr3객체는 매개변수가 private
		hr2.sing();
		hr3.drinkTea();
		
		hr.sing();
		hr.drinkTea();
		hr.dance();
	}
	
	public void sing() {
		
	}
	
	protected void drinkTea() {
		
	}
	
	private void dance() {
		
	}

	void setStar(int star) {
		this.star = star;
	}
	
	int getStar() {
		return star;
	}
	
}
