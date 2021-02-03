package com.kita.first.level4.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList<MenuItem>();
	
	public Menu() {
		arr.add(new MenuItem("아메리카노", 2000));
		arr.add(new MenuItem("카페라떼", 3000));
		arr.add(new MenuItem("카페모카", 3500));
		arr.add(new MenuItem("카라멜마끼아또", 4000));
	}
	
	public void menuSetter(MenuItem mi) { //메뉴 추가
		arr.add(mi);
	}
	
	public String showMenus() {
		System.out.println("Menu");
		for(int i=0; i<arr.size(); i++) {
			MenuItem m = arr.get(i);
			System.out.printf("%d. %s\t\t%,d원\n", i+1, m.getName(), m.getPrice());
		}
		return ""; //빈 값 리턴 -> 더 빠름 (void로 해도 됨)
	}
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
	
}
