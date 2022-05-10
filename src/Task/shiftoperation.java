package Task;

public class shiftoperation {
    public static void main(String[] args) {
        int i = 5;
        int j = -5;

        String s = Integer.toBinaryString(i); // get byte i
        String s1 = Integer.toBinaryString(j);
        System.out.println(s);   // 101
        System.out.println(s1);  // 11111111111111111111111111111011

        // 正数右移高位补0，负数带符号右移高位补0，不带符号右移高位补1
        System.out.println(i >> 2); // 1
        System.out.println(j >> 2); // -2
        String s2 = Integer.toBinaryString(j>>2);
        System.out.println(s2); // 11111111111111111111111111111110
        System.out.println( j >>> 2);
        System.out.println(Integer.toBinaryString(j >>> 2)); //00111111111111111111111111111110

        // 左移低位补0
        System.out.println(i<<2); // 20
        System.out.println(Integer.toBinaryString(i<<2)); // 10100
        System.out.println(j<<2); // -20
        System.out.println(Integer.toBinaryString(j<<2)); // 11111111111111111111111111101100

        // 按位运算（其中按位非是一元操作符）
        System.out.println(2&3); // 2
        System.out.println(6|10); // 14
        System.out.println(5^9); // 12
        System.out.println(~5); // -6
    }
}
