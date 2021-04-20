package com.atguigu.java;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[] {34, 67, 89, 76, 42, 11, 80, 47};
		System.out.println(util.getMax(arr));
		System.out.println(util.getMin(arr));
		System.out.println(util.getSum(arr));
		System.out.println(util.getAvg(arr));
		arr = util.getReverse(arr);
		util.iterate(arr);
		util.sortArray(arr);
		util.iterate(arr);
		System.out.println(util.findIndex(arr, 47));
		
		
	}
}
		

