package org.example.dsa.array.easy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given an integer array arr[], print all distinct elements from this array.
 * The given array may contain duplicates and the output should contain every element only once.
 * <p>
 * Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
 * Output: {12, 10, 9, 45, 2}
 * <p>
 * Input: arr[] = {1, 2, 3, 4, 5}
 * Output: {1, 2, 3, 4, 5}
 * <p>
 * Input: arr[] = {1, 1, 1, 1, 1}
 * Output: {1}
 */
public class Q1_Distinct_Element {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 10, 9, 45, 2, 10, 10, 45};
        naiveApproach(arr).forEach(System.out::println);
        System.out.println(" ");
        betterApproach(arr).forEach(System.out::println);
        System.out.println(" ");
        expectedApproach(arr).forEach(System.out::println);

    }

    /**
     * this approch take n^2  time
     *
     * @param arr
     * @return
     */
    public static List<Integer> naiveApproach(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    break;
                }
            }
            if (j == i) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    /**
     * This approch takes time log(n) cause of sorting.
     *
     * @param arr
     * @return
     */
    public static List<Integer> betterApproach(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                res.add(arr[i]);
            }
        }
        return res;
    }

    /**
     * This is Expected Approach Where Time Complexity Is O(n) and space is also O(n)
     *
     * @param arr
     * @return
     */
    public static List<Integer> expectedApproach(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return new ArrayList<>(set);
    }

}


