class ForTest{
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			System.out.println("Hello, World!");
		}

		for(int num = 1; num <= 100; num++){
			if(num % 2 == 0){
				System.out.println(num + "为偶数");
			}
		}
	}
}