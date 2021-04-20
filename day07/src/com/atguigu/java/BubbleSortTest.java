package com.atguigu.java;

public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = new int[]{43, 59, 12, 22, 98, 74, 67, 38, 59};
		
		// 冒泡排序
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=0; j<arr.length - i - 1; j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
