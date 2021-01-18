package com.kita.first.level2;

public class Magician extends Adventurer{
	int mp;
	
	Magician(int strength, int intelligence, int dexterity, int luck, int mp) {
		super(strength, intelligence, dexterity, luck);
		this.mp = mp;
	}
	
	void teleport() {
		System.out.println("텔레포트를 한다.");
	}
	
	@Override //부모 객체에 같은 이름의 메소드가 있는지 확인
	void attack() {
		System.out.println("마법공격을 한다.");
	}
	
	@Override
	void jump() {
		System.out.println("마법점프를 한다.");
	}
	
}
