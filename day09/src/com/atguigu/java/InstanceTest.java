package com.atguigu.java;

public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
//		p = null;
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		
		// 匿名对象
		new Phone().price = 1999;
//		new Phone().sendEmail();
		new Phone().showPrice();
		
		// 匿名对象的使用：这个时候 匿名对象 在整个方法里多次使用了 
		PhoneMall mall = new PhoneMall();
		mall.show(new Phone());
	}
}

class PhoneMall{
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}


class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("send email");
	}
	
	public void playGame() {
		System.out.println("play a game");
	}
	
	public void showPrice() {
		System.out.println("the phone costs " + price);
	}
}