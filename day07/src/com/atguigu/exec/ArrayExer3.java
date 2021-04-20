package com.atguigu.exec;

public class ArrayExer3 {
	public static void main(String[] args) {
		int [] arr1 = new int [] {2, 3, 5, 7, 11, 13, 17, 19};
		int [] arr2 = new int[8];
		for(int element: arr1) {
			System.out.print(element+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i]+ " ");
		}
		for(int i=0; i<arr2.length; i+=2) {
			arr2[i] = i;
		}
		System.out.println();
		for(int element: arr2) {
			System.out.print(element+" ");
		}
	}
}
