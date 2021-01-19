package com.kita.first.level2.pack1;

public class Test_pack1 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 5;
		int n3 = 7;
		FinalStatic fs1 = new FinalStatic(n1, n2);
		FinalStatic fs2 = new FinalStatic(n2, n3);
		FinalStatic fs3 = new FinalStatic(n3, n1);
		
		System.out.println(fs1.N1);
		System.out.println(fs2.N1);
		System.out.println(fs3.N1);
		System.out.println();
//		System.out.println(fs1.N2);
//		System.out.println(fs2.N2);
//		System.out.println(fs3.N2);
		
//		fs1.printNum(1);
		
//		Singleton singleton = Singleton.getInstance();
		
//		java.util.Scanner scan = new java.util.Scanner(System.in);
		
//		Class1 c1 = new Class1();
//		com.kita.first.level2.pack2.Class1 c2 = new com.kita.first.level2.pack2.Class1();
		
	}
}
