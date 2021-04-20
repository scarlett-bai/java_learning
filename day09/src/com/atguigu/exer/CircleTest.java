package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle cir = new Circle();
		PassObject pass = new PassObject();
		pass.printAreas(cir, 5);
	}
}


class Circle{
	double radius;
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
}

class PassObject{
	public void printAreas(Circle c, int time) {
		System.out.println("Radius\tAre");
		for(int i=1; i<=time; i++) {
			c.radius = (double)i;
			System.out.println(c.radius + "\t" + c.findArea());
		}
	}
}