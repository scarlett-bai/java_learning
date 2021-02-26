class VariableTest{
	public static void main(String[] args) {
		byte b1 = 22;
		byte b2 = -128;

		int myAge = 12;
		System.out.println(myAge);
		System.out.println("b1 is byte,value is " + b1);
		System.out.println("b2 is byte,value is " + b2);

		short s1 = 128;
		long l1 = 123456l;

		double d1 = 123.2;
		float f1 = 123.88f;

		// 字符型  char  1字符=2byte
		char c1 = 'a';

		boolean isMarried = true;
		if(isMarried){
			System.out.println("你就不能参加单身party了");
		}else{
			System.out.println("你可以多谈谈女朋友！"); 
		}
	}
}