class VariableTest1{
	public static void main(String[] args) {
		// 自动类型转换
		byte b1 = 2;
		int l1 = 129;
		int b2 = b1 + l1;

		float f = b1 + l1;
		// 强制类型转换
		double d1 = 12.3;
		int l2 = (int)d1;  // 截断操作 损失精度
		System.out.println(l2);
		System.out.println("*\t*");

		
	}
}