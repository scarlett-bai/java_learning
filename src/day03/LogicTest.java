class LogicTest{
	public static void main(String[] args) {
		// 区分 &   &&
		// 相同点：1.运算结果相同 2.当符号左边都是true时，二者都会执行符号右边的运算
		// 不同点：当符号左边为false时，& 还会执行后面的判断，&& 则停止判断

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