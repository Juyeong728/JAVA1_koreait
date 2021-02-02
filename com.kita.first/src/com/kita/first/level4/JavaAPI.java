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
		
		char c = new Character('A');
		int num2 = new Integer("1000");
		double num3 = new Double("34.5678"); 
		System.out.println(c+num2+num3);
		
		String str2 = "오늘은 날씨가 좋다.";
		Character v1 = str2.charAt(4);
		System.out.println("v1: " + v1);
		
		int idx = str2.indexOf("날씨가");
		System.out.println("idx: " + idx);
		
		int len = str2.length();
		System.out.println("len: " + len);
		
		String str3 = str2.replace("날씨가", "기분이");
		System.out.println("str3: " + str3); 
		
		int num4 = new Integer("010801");
		System.out.println("num4: " + num4);
		
		String ad = "010801 3456789";
		Character c2 = ad.charAt(7);
		
		switch(c2) {
		case 1: case 3:
			System.out.println("남자입니다.");
		case 2: case 4:
			System.out.println("여자입니다.");
		}
		
		String str4 = str2.substring(4);
		System.out.println("str4: " + str4);
		
		String str5 = str2.substring(4, 7);
		System.out.println("str5: " + str5);
		
		String str6 = "Hello! I'm fine thank you and you?";
		String str7 = str6.toLowerCase();
		String str8 = str6.toUpperCase();
		System.out.println("str7: " + str7);
		System.out.println("str8: " + str8);
		
		String str9 = "  안녕   ";
		String str10 = str9.trim();
		System.out.println("str10: " + str10);
		
		double n1 = Math.abs(-3.4); //절댓값
		System.out.println("n1: " + n1);
		
		double n2 = Math.ceil(5.3); //올림값
		System.out.println("n2: " + n2);
		
		double n3 = Math.floor(5.3); //내림값
		System.out.println("n3: " + n3);
		
		double n4 = Math.round(5.3); //반올림값
		System.out.println("n4: " + n4);
				
		
	}
}
