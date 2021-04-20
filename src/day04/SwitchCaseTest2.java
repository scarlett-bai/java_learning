import java.util.Scanner;

class SwitchCaseTest2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输出20201年的month：");
		int month = scanner.nextInt();
		System.out.println("请输出20201年的day：");
		int day = scanner.nextInt();

		// switch(month){
		// 	case 1:
		// 		break;
		// 	case 2:
		// 		day = 31 + day;
		// 		break;
		// 	case 3:
		// 		day = 31 + 28 + day;
		// 		break;
		// 	case 4:
		// 		day = 31 * 2 + 28 + day;
		// 		break;
		// 	case 5:
		// 		day = 31 * 2 + 38 + 30 + day;
		// 		break;

		// }

		// System.out.println("此日期为2021年第" + day + "天");

		int day1 = 31;
		int day2 = day1 + 28;
		int day3 = day2 + 31;
		int day4 = day3 + 30;
		int day5 = day4 + 31;
		int day6 = day5 + 30;
		int day7 = day6 + 31;
		int day8 = day7 + 31;
		int day9 = day8 + 30;
		int day10 = day9 + 31;
		int day11 = day10 + 30;

		switch(month){
			case 1:
				break;
			case 2:
				day = day1 + day;
				break;
			case 3:
				day = day2 + day;
				break;
			case 4:
				day = day3 + day;
				break;
			case 5:
				day = day4 + day;
				break;
			case 6:
				day = day5 + day;
				break;
		}
		System.out.println("此日期为2021年第" + day + "天");


	}
}