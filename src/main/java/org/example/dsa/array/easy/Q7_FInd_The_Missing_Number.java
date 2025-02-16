package org.example.dsa.array.easy;

/**
 * Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
 * This array represents a permutation of the integers from 1 to n with one element missing.
 * Find the missing element in the array.
 * <p>
 * Input: arr[] = [1, 2, 4, 6, 3, 7, 8]
 * Output: 5
 * Explanation: Here the size of the array is 7, so the range will be [1, 8]. The missing number between 1 to 8 is 5
 * <p>
 * <p>
 * Input: arr[] = [1, 2, 3, 5]
 * Output: 4
 * Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
 * <p>
 * <p>
 * Try it on GfG Practice
 */

public class Q7_FInd_The_Missing_Number {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(usingSumFormula(arr));
        System.out.println(" ");
        System.out.println(usingXor(arr));


    }


    public static int usingSumFormula(int[] arr) {
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        return ((arr.length + 1) * (arr.length + 2) / 2) - sum1;
    }


    /**
     * This is Expected Approach Where time is O(n) and space is O(1)
     *
     * @param arr
     * @return
     */
    public static int usingXor(int[] arr) {
        int res1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            res1 = res1 ^ arr[i];
        }
        int res = 0;
        for (int k = 1; k <= arr.length; k++) {
            res = res ^ k;
        }
        return res ^ res1;
    }
}
