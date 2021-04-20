package com.atguigu.java;

public class ArrayUtil {

	
	// 求数组最大值
	public int getMax(int[] arr) {
		int maxItem = 0;
		for(int i=0; i<arr.length; i++) {
			maxItem = (maxItem > arr[i]) ? maxItem: arr[i];
		}
		return maxItem;
	}
	// 求数组最小值
	public int getMin(int[] arr) {
		int minItem = arr[0];
		for(int i=0; i<arr.length; i++) {
			minItem = (minItem < arr[i]) ? minItem: arr[i];
		}
		return minItem;
	}
	
	// 求数组的总和
	public int getSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	// 求数组的平均值
	public int getAvg(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / arr.length;
		return avg;
	}
	
	// 反转数组
	public int[] getReverse(int[] arr) {
		int[] arr1 = new int[arr.length];
		for(int i=arr.length - 1; i>=0; i--) {
			arr1[arr.length - 1 - i] = arr[i];
		}
		return arr1;
	}
	
	// 复制数组
	public int[] paste(int[] arr) {
		return arr;
	}
	
	// 数组排序
	public void sortArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// 遍历数组
	public void iterate(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	// 查找指定元素
	public int findIndex(int[] arr, int a) {
		int resIndex = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == a) {
				return i;
			}
		}
		return resIndex;
	}
}
