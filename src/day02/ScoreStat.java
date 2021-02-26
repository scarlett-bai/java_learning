import java.util.Scanner;

public class ScoreStat{
	Scanner input = new Scanner(System.in);
	System.out.print("STB的成绩是：");
	int stb = input.nextInt(); //stb分数
	System.out.print("Java的成绩是：");
	int java = input.nextInt();
	System.out.print("SQL的成绩是：");
	int sql = input.nextInt();

	System.out.println("STB\tJava\tSQL");
	System.out.println(stb+"\t"+java+"\t"+sql);

	double avgScore = (stb + java + sql)/3;
	System.out.println("平均成绩为：" + avgScore)
}