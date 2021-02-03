package com.kita.first.level4.cafe;

public class Barista {
	public Coffee makeCoffee(MenuItem mi) {
		Coffee coffee = new Coffee(mi);
		return coffee;
	}
}
