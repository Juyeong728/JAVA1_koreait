package com.kita.first;

public class Foreach {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1)*2;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(int val : arr) {
			System.out.println(val);
		}
		
	}
}
