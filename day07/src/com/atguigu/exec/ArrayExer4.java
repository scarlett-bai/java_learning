package com.atguigu.exec;

public class ArrayExer4 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ", "DD", "GG", "MM"};
		// 数组的复制（区别于数组变量的赋值，arr1 = arr2）
		String[] arr1 = new String[arr.length];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = arr[i];
		}
		
		// 数组的反转
		String[] arr2 = new String[arr.length];
		for(int i=arr.length; i>0; i--) {
			arr2[arr.length - i] = arr[i - 1];
		}
		for(String element: arr2) {
			System.out.print(element + ", ");
		}
		
		// 方法2
//		for(int i=0, j=arr.length-1; i<j; i++, j--) {
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
		
		
		// 查找（搜索）
		// 线性查找
		System.out.println();
//		String dest = "MM";
//		Boolean answer = false;
//		for(int i=0; i<arr.length; i++) {
////			answer = (arr[i] == dest) ? true : false;
//			if(dest.equals(arr[i])) {
//				System.out.println("找到了指定的元素，位置为："+ i);
//				break;
//			}
//		}
//		System.out.println(answer);
		
		// 二分法查找，前提：要查找的数组是有序的
		int[] arr3 = new int[] {-98, -34, 2, 34, 54, 66, 78, 108, 999};
		int dest1 = 66;
		int head = 0; // 初始的首索引
		int end = arr3.length - 1; // 初始的末索引
		Boolean isFlag = false;
		while(head <= end) {
			int middle = (head + end)/2;
			if(dest1 == arr3[middle]) {
				System.out.println("找到了指定的元素，位置为：" + middle);
				isFlag = true;
				break;
			}else if(arr3[middle] > dest1) {
				end = middle - 1;
			}else {
				head = middle + 1;
			}
		}
		
		if(isFlag == false) {
			System.out.println("没有找到指定的元素！");
		}
	}
}
