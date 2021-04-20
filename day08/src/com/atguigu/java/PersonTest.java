package com.atguigu.java;
// 测试类
public class PersonTest {
	public static void main(String[] args) {
		// 创建Person类的对象
		Person p1 = new Person();
		// Scanner scan = new Scanner()
		
		// 调用对象的结构：属性 和方法
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		p1.eat();
		p1.talk("English");
	}
}

class Person{
	// 属性
	String name;
	int age;
	boolean isMale;
	
	// 方法
	public void eat() {
		System.out.println("people can eat!");
	}
	public void sleep() {
		System.out.println("people can sleep!");
	}
	public void talk(String language) {
		System.out.println("people can talk with each other by " + language);
	}
}