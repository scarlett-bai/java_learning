class PrintStar{
	public static void main(String[] args) {
		for(int i=1; i < 6; i++){
			for(int j=1; j <= i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		int count = 1;
		for(int m=1; m<=100; m++){
			Boolean flag = true;
			for(int n=2; n <= m - 1; n++){
				if((m % n) == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(m + "为质数~");
				count += 1;
			} 
			
		}
		System.out.println("从1-100中质数有" + count + "个");
	}
}