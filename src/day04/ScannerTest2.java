import java.util.Scanner;

class ScannerTest2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = scanner.nextInt();
		System.out.println("请输入第三个整数：");
		int num3 = scanner.nextInt();

		// if(num1 > num2){
		// 	(num3 > num1) ? System.out.println("从大到小的排序为："+ num3+num1+num2): 
		// 	((num3 < num2) ? System.out.println("从大到小的排序是：" + num1+num2+num3):
		// 		System.out.println("从大到小的排序是：" + num1+num3+num2))
		// }

		int max, mid, min;
		String resStr = "从大到小的排序是：" + max+mid+min;

		if(num1 > num2){
			(num3 > num1) ? max=num3,mid=num1,min=num2:
			((num3 < num2) ? max=num1,mid=num2,min=num3: 
				max=num1,mid=num3,min=num2);
		}else{
			(num3 > num2) ? max=num3,mid=num2,min=num1:
			((num3 < num1) ? max=num2,mid=num1,min=num3: 
				max=num2,mid=num3,min=num1);
		}

		System.out.println(resStr);

	}(num3 > num1) ? max=num3,mid=num1,min=num2:
			((num3 < num2) ? max=num1,mid=num2,min=num3: 
				max=num1,mid=num3,min=num2);
}