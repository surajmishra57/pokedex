package org.example.algo.mathamatics.gcd_and_lcm;

public class Q1_GCD_Or_HCF {
    public static void main(String[] args) {
        int a = 98, b = 56;
        System.out.println(optimized_gcd(a, b));
    }

    public static int optimized_gcd(int a, int b) {
        if (b == 0)
            return a;
        return optimized_gcd(b, a % b);
    }
}
