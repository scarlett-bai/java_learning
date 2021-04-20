package com.atguigu.java;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		// equals 比较数组是否相等
		int[] arr1 = new int[]{1, 2, 3, 4};
		int[] arr2 = new int[]{1, 3, 2, 4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		// toString  输出数组信息
		System.out.println(Arrays.toString(arr1));
		
		// fill 将指定值填充到数组中
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		// sort 对数组进行排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		// binarySearch  二分查找
		int [] arr3 = new int [] {2, 3, 5, 7, 11, 13, 17, 19};
		int indexResult = Arrays.binarySearch(arr3, 11);
		System.out.println(indexResult);
	}
}
