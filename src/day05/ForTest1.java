import java.util.Scanner;

class ForTest1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int n = scan.nextInt();
		System.out.println("请输入第二个整数：");
		int m = scan.nextInt();

		int min = (n <= m) ? n: m;
		int max = (n > m) ? n: m;
		int i = 0;
		for(i = min; max % i != 0 || min % i != 0; i--){
		}
		System.out.println(m + "和" + n + "的最小公约数为" + i);

		int l = 0;
		for(l = max; l % max != 0 || l % min != 0; l++){

		}
		System.out.println(m + "和" + n + "的最大公倍数为" + l);
	}
}