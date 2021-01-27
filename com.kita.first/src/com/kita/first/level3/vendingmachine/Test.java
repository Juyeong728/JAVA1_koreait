package com.kita.first.level3.vendingmachine;

public class Test {
	public static void main(String[] args) {
		// 자판기 게임
		// 메뉴 : 콜라, 사이다, 캔커피, 데자와, 환타, 웰치스
		// 가격 : 900, 700, 400, 500, 600, 1000
		
		int len = 6;
		Menu menu = new Menu(len);
		PrintV print = new PrintV();
		
		menu.inputArrItems();
		menu.inputArrPrices();
		
		System.out.println("---메뉴---");
		for(int i=0; i<len; i++) {
			print.printMenu(menu, i);
		}
		
		//메뉴, 가격 배열에 값 입력
		Game game = new Game();
		int myNum;
		
		while(true) {
			myNum = game.inputNum();
			
			if(myNum>6 || myNum<0) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if(myNum==0) { 
				break;
			}
			
			game.setCount();
			game.sumMenuPrice(menu, myNum);
			print.printMenu(menu, myNum);
		}
		print.printTotalPrice(game);
		
	}
}
