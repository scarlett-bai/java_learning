class AriTest{
    public static void main(String[] args) {
        // 除号：/
        int num =12;
        int num2 = 5;
        int result1 = num / num2;
        System.out.println(result1);

        int result2 = num / num2 * num2;
        System.out.println(result2);  // 10

        double result3 = num / num2;
        System.out.println(result3);  // 2.0

        double result4 = num / (num2 + 0.0);
        System.out.println(result4); // 2.4
        double result5 = (double)num / num2; // 2.4

        // 前++
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + "b1 = " + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + "b2 = " + b2);

    }
}

