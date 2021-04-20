/*
如何从键盘获取不同类型的变量 需要使用Scanner类 
*/

import java.util.Scanner;

class SannerTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输出你的姓名：");
		String name = scan.next();
		// int num = scan.nextInt();
		System.out.println("请确认你的姓名为：" + name	);
	}
}