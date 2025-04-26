package org.example.algo.mathamatics.gcd_and_lcm;

public class Q2_LCM {
    public static void main(String[] args) {
        int a = 15, b = 20;
        System.out.println(getLCM(a, b));
    }

    private static int getLCM(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
