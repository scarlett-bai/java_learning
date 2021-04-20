package com.atguigu.exer;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[20];
		for(int i=0; i<20; i++) {
			students[i] = new Student();
			students[i].number = i + 1;
			students[i].state = students[i].getState();
			students[i].score = students[i].getScore();
			if(students[i].state == 3) {
				System.out.println("该学生学号为：" + 
			students[i].number + ",年级为：" + students[i].state + ",分数为：" + students[i].score);
			}
		}
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<20-i-1; j++) {
				if(students[j].score > students[j + 1].score) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
		
		for(int i=0; i<20; i++) {
			System.out.println("第" + i + "位学生，学号：" + students[i].number 
					+ ",年级为：" + students[i].state + ",分数为：" + students[i].score);
		}
		
		
	}

}

class Student{
	int number;
	int state;
	int score;
	
	public int getState() {
		return (int) (Math.random() * 5 + 1);
	}
	
	public int getScore() {
		return (int)(Math.random() *(100 - 20 +1) + 20);
	}
}