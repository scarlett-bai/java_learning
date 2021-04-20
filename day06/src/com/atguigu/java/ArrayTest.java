package com.atguigu.java;

public class ArrayTest {
	public static void main(String[] args) {
		int num; //声明
		num = 10; //初始化
		int[] ids; //声明数组
		//静态初始化:数组的初始化和数组元素的复制操作同时进行
		ids = new int[]{1001, 1002, 1003, 1004};
		// 动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		// 通过索引的方式调用
		names[0] = "mary";
		names[1] = "tom";
		names[2] = "lili";
		names[3] = "lisa";
		names[4] = "mike"; 
		
//		System.out.println(names);
		
		//获取数组的长度：length
		System.out.println(names.length);
		
		//遍历数组
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}

