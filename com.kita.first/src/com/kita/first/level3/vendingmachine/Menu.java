package com.kita.first.level3.vendingmachine;

import java.util.Scanner;

import com.kita.first.level3.Utils;

public class Menu {
	//필드
	private String[] menuArr;
	private int[] priceArr;
	Scanner scan = new Scanner(System.in);
	
	//생성자
	public Menu(int len) {
		menuArr = new String[len];
		priceArr = new int[len];
	}
	
	//메소드
	public void setMenuItem(int index, String item) {
		menuArr[index] = item;
	}
	
	public void setMenuPrice(int index, int price) {
		priceArr[index] = price;
	}
	
	public String getMenuItem(int index) {
		return menuArr[index];
	}
	
	public int getMenuPrice(int index) {
		return priceArr[index];
	}
	
	//메뉴배열에 순차적으로 값 입력
	void inputArrItems(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번째 값 입력: ", i+1);
			String str = scan.next();
			arr[i] = str;
		}
	}
	
	//가격배열에 순차적으로 값 입력
	void inputArrItems(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번째 값 입력: ", i+1);
			String str = scan.next();
			int num = Utils.parseStrToInt(str);
			if(num == 0) {
				System.out.println("잘못 입력하셨습니다.");
				i--;
				continue;
			}
			arr[i] = num;
		}
	}
	
}
