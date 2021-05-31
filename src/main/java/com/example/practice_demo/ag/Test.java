package com.example.practice_demo.ag;

public class Test {
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            int remainder = x % 10;
            x = x / 10;
            if ( (Integer.MAX_VALUE - remainder) / (10 * result) < 0){
                return 0;
            }
            if ((Integer.MIN_VALUE - remainder) / (10 * result) > 0){
                return 0;
            }
            result = result * 10 + remainder;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Test().reverse(0));
        System.out.println(new Test().reverse(123));
        System.out.println(new Test().reverse(-123));
        System.out.println(new Test().reverse(2147483647));
        System.out.println(new Test().reverse(-2147483647));
    }
}
