package com.atguigu.exer;

public class RecursionTest {
	public static void main(String[] args) {
		Recursion recu = new Recursion();
//		System.out.println(recu.getRes(2));
		recu.len = 2;
		System.out.println(2);
		recu.iterate(recu.arr);
	}
}


class Recursion{
	public int getRes(int num) {
		if(num==0) {
			return 1;
		}else if(num==1) {
			return 4;
		}else {
			return 2* getRes(num - 1) + getRes(num - 2);
		}
	}
	int len;
	int[] arr = new int[len];
	
	public int Fabo(int num) {
		arr[0] = 1;
		if(num==1) {
			arr[num-1] = 1;
			return arr[num-1];
		}else if(num==2) {
			arr[num-1] = 1;
			return arr[num-1];
			
		}else {
			arr[num-1] = Fabo(num-1) + Fabo(num-2);
			return arr[num-1];
		}

		
	}
	
	public void iterate(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


