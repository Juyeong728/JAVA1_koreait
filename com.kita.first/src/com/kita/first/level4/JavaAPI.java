package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		
		String str = "안녕";
		StringBuffer sb = new StringBuffer("안녕");
		boolean result = (str.equals(str)); //앞의 값이 String이어야 함
		boolean result2 = (str.contentEquals(sb));
		
		System.out.println(result);
		System.out.println(result2);
		
		str = "124";
		Integer.parseInt(str);
		str = "2.3";
		Double.parseDouble(str);
		Float.parseFloat(str);
		
		Math.random(); // 0 ~ 0.999999999999
		
		int num = 5;
		String.valueOf(num); 
	}
}
