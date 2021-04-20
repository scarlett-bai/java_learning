package com.atguigu.exec;

public class ArrayExer2 {
	public static void main(String[] args) {
		int [][] yanghui = new int[10][];
		for(int i=0; i<yanghui.length; i++) {
			yanghui[i] = new int[i+1];
			yanghui[i][0] = 1;
			yanghui[i][i] = 1;
			if(i>1){
				for(int j=0; j<=i; j++) {
					if(j>0 && j < i) {
						yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
					}
				}
			}
			
		}
		for(int i=0; i<yanghui.length; i++) {
			for(int j=0; j<yanghui[i].length; j++) {
				System.out.print(yanghui[i][j]);
			}
			System.out.println();
		}
	}
}
