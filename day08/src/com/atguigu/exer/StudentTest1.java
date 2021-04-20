package com.atguigu.exer;

public class StudentTest1 {
	public static void main(String[] args) {
		Student1[] students = new Student1[30];
		for(int i=0; i<students.length; i++) {
			students[i] = new Student1();
			students[i].number = i + 1;
			students[i].state = students[i].getState();
			students[i].score = students[i].getScore();
			if(students[i].state == 3) {
				students[i].info();
			}
		}
		
		for(int i=0; i<students.length; i++) {
			for(int j=0; j<students.length-i-1; j++) {
				if(students[j].score > students[j + 1].score) {
					Student1 temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
		
		for(int i=0; i<students.length; i++) {
			students[i].info();
		}
		
		
	}

}

class Student1{
	int number;
	int state;
	int score;
	
	public int getState() {
		return (int) (Math.random() * 6 + 1);
	}
	
	public int getScore() {
		return (int)(Math.random() *(100 - 20 +1) + 20);
	}
	
	public void info() {
		System.out.println("该学生学号为：" + number + ",年级为：" + state + ",成绩为：" + score);
	}
}