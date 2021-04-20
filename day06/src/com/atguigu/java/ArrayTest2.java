package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 1.二维数组的声明和初始化:静态初始化
		int[][] arr = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		// 动态初始化
		String[][] arr1 = new String[3][2]; // 3行2列
		String[][] arr2 = new String[3][]; // 3行 和不确定的列
		int[][] arr3 = {{1, 2, 3}, {4, 5}, {6, 7, 8}}; // 类型推断
		
		// 2.调用二维指定位置的元素
//		System.out.println(arr[0][1]);
//		System.out.println(arr1[1][1]);
//		arr2[1] = new String[4];
//		System.out.println(arr2[1][0]);
//		
//		// 3.获取数组的长度
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		// 4.如何遍历二维数组
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		// 5.二维数组的默认值
		System.out.println(arr1[0]);  // [Ljava.lang.String;@19469ea2
		System.out.println(arr);  // [[I@13221655  二维数组 Int型
	}	
}
   