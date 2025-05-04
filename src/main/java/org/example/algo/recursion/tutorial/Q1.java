package org.example.algo.recursion.tutorial;

public class Q1 {
    public static void main(String[] args) {
        /**
         * Print Name 5 time
         */
//        printNameNTimes(1, 5);
//        print1ToN(1, 10);
//        printNTo1UsingBackTracking(1, 10);
//        printNTo1(10);
//        sumOfFirstNNaturalNumberPerametrized(10, 0);
//        System.out.println(sumOfFirstNNaturalNumberFunctional(10));
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        reverseTheArrayUsingRecusionUsingTwoPointer(arr, 0, arr.length - 1);
//        Arrays.stream(arr).forEach(System.out::print);
//        reverseTheArrayUsingRecursion(arr, 0);
//        Arrays.stream(arr).forEach(System.out::print);
//        String str = "surus";
//        System.out.println(checkIfPalamdromOrNot(str, 0, str.length() - 1));
        System.out.println(fibNumber(5));


    }

    private static int fibNumber(int i) {
        if (i <= 1)
            return i;
        return fibNumber(i - 1) + fibNumber(i - 2);
    }

    private static boolean checkIfPalamdromOrNot(String str, int low, int high) {
        if (low >= high)
            return true;
        if (str.charAt(low) != str.charAt(high))
            return false;
        return checkIfPalamdromOrNot(str, low + 1, high - 1);
    }

    private static void reverseTheArrayUsingRecursion(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseTheArrayUsingRecursion(arr, i + 1);
    }

    private static void reverseTheArrayUsingRecusionUsingTwoPointer(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseTheArrayUsingRecusionUsingTwoPointer(arr, i + 1, j - 1);
    }


    private static int sumOfFirstNNaturalNumberFunctional(int i) {
        if (i == 1)
            return 1;
        return i + sumOfFirstNNaturalNumberFunctional(i - 1);
    }

    private static void sumOfFirstNNaturalNumberPerametrized(int i, int sum) {
        if (i < 0) {
            System.out.println(sum);
            return;
        }
        sumOfFirstNNaturalNumberPerametrized(i - 1, sum + i);

    }


    private static void printNTo1(int n) {
        if (n < 0)
            return;
        System.out.println(n);
        printNTo1(n - 1);
    }

    private static void printNTo1UsingBackTracking(int i, int n) {
        if (i > n)
            return;
        printNTo1UsingBackTracking(i + 1, n);
        System.out.println(i);
    }

    private static void print1ToN(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1ToN(i + 1, n);
    }

    private static void printNameNTimes(int i, int n) {
        if (i > n)
            return;
        System.out.println("hello");
        printNameNTimes(i + 1, n);
    }
}
