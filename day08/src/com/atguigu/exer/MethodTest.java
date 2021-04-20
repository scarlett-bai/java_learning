package com.atguigu.exer;

public class MethodTest {
	public static void main(String[] args) {
		Method m1 = new Method();
		int area = m1.rectact(4, 9);
		System.out.println("The rec area is " + area);
	}
}


class Method{
	public int rectact(int m, int n) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return m * n;
	}
}