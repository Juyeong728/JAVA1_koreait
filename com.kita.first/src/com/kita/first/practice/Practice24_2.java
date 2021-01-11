package com.kita.first.practice;

public class Practice24_2 {
	public static void main(String[] args) {
		int[] arr = {29, 33, 15, 88, 2, 46, 92, 1, 19};
		//버블 정렬
		
		int temp = 0;
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		/*
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		 */
		
		for(int val : arr) {
			System.out.print(val+", ");
		}
		
	}
}
