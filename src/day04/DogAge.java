import java.util.Scanner;

class DogAge{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入狗狗的年龄");
		int dogAge = scanner.nextInt();
		if(dogAge < 0){
			System.out.println("输入数据非法");
		}else if (dogAge <= 2) {
			double resAge = dogAge * 10.5;
			System.out.println("换算成人类的年龄是：" + resAge);
		}else{
			double resAge = 2 * 10.5 + (dogAge - 2) * 4;
			System.out.println("换算成人类的年龄是：" + resAge);
		}

		
	}
}