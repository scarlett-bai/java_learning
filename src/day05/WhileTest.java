import java.util.Scanner;

class WhileTest{
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i + "为偶数");
			}
			i++;
		}

		int positive = 0;
		int negative = 0;
		while(true){
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入一个整数：");
			int num = scan.nextInt();
			if(num > 0){
				positive += 1;
			}else if(num < 0){
				negative += 1;
			}else if(num == 0){
				break;
			}

		}
		System.out.println("输入的整数中，正整数为" + positive + "个，负整数为" + negative + "个");
	}
}