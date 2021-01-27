package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	private int count = 0;
	private int totalPrice = 0;
	
	//번호 입력받기
	public int inputNum() {
		System.out.print("메뉴를 입력하세요(0입력시 종료): ");
		return scan.nextInt();
	}
	
	//메뉴가격 합산
	public void sumMenuPrice(Menu menu, int num) {
		totalPrice += menu.getMenuPrice(num);
	}
	
	
	public void setCount() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}
