package com.kita.first.level2;

public class Car {
	private int speed;
	private String color;
	
	Car(int speed) {
		this.speed = speed;
	} //1.생성시킬 때 값 집어넣기
	
	void setSpeed(int speed) {
		this.speed = speed;
	} //2.setter를 통해 값 집어넣기
	
	int getSpeed() {
		return speed;
	} //필드 리턴
	
	void setColor(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}
	
}
