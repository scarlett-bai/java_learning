class LogicTest{
	public static void main(String[] args) {
		// 区分 &   &&
		boolean b1 = false;
		int num = 10;
		if(b1 & (num++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}

		System.out.println("num is " + num);

		boolean b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}

		System.out.println("num2 is " + num2);
	}
}