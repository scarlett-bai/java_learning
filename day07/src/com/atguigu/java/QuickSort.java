package com.atguigu.java;

public class QuickSort {
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private static void subSort(int[] data, int start, int end) {
		if(start < end) {
			int base = data[start];
			int low = start;
			int high = end + 1;
			while(true) {
				while(low < end && data[++low] - base <= 0);
				while(high > start && data[--high] - base >= 0);
				if(low < high) {
					swap(data, low, high);
				}else {
					break;
				}
			}
			swap(data, start,high);
			subSort(data, start, high - 1);
			subSort(data, high + 1, end);
		}
	}
	
	public static void quickSort(int[] data) {
		subSort(data, 0, data.length-1);
	}
	public static void main(String[] args) {
		int[] arr = new int[]{43, 59, 12, 22, 98, 74, 67, 38, 59, 99, 27};
		System.out.println("排序之前：\n" + java.util.Arrays.toString(arr));
		quickSort(arr);
		System.out.println("排序之后：\n" + java.util.Arrays.toString(arr));
	}
}
