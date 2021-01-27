package com.kita.first.level3.vendingmachine;

public class PrintV {
	//메뉴이름과 가격 찍기
	public void printMenu(Menu menu, int n) {
		String item = menu.getMenuItem(n);
		int price = menu.getMenuPrice(n);
		System.out.printf("%d. %s %d원\n", n+1, item, price);
	}
	
	public void printTotalPrice(Game game) {
		System.out.printf("합계: %d원\n", game.getTotalPrice());
	}
	
}
