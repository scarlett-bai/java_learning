package com.atguigu.java;

public class ArrayTest1 {
	public static void main(String[] args) {
		int [] arr = new int[10]; 
		int max = 0;
		int min = 0;
		int sum = 0; 
		int avg = 0;
		System.out.println("生成的随机数组为：");
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (99-10+1) + 10);
			System.out.print(arr[i]+",");
			max = (arr[i] > max) ? arr[i] : max;
			min = (arr[i] < min) ? arr[i] : min;
			sum += arr[i];
		}
		avg = sum / 10;
		System.out.println();
		System.out.println("最大值为"+max+"，最小值为"+min+",和数为"+sum+",平均数为"+avg);
	}
		
}
