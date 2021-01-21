package com.kita.first.level2.practice2;

public class Practice03 {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Practice03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public static void main(String[] args) {
		Practice03 myP = new Practice03("김댕댕", 20);
		myP.setName("김냥냥");
		
		//이름, 나이 출력
		String myPName = myP.getName();
		int myPAge = myP.getAge();
		System.out.printf("이름: %s, 나이: %d\n", myPName, myPAge);
		
	}
}
