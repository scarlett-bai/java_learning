class TernaryOperator{
	public static void main(String[] args) {
		// 获取两个整数的较大值
		int m = 12;
		int n = 12;

		// int max = (m > n) ? m: n;
		// System.out.println(max);

		String maxStr = (m > n) ? "m大": ((m == n) ? "m和n相等": "n大");
		System.out.println(maxStr);

		// 获取三个数的最大值
		int n1 = 12;
		int n2 = 30;
		int n3 = -42;

		int max1 = (n1 > n2) ? n1: n2;
		int max = (max1> n3) ? max1: n3;
		System.out.println(max);
	}
}