package org.example.dsa.array.easy;

import java.util.HashMap;

/**
 * Given an array of integers.
 * All numbers occur twice except one number which occurs once.
 * Find the number in O(n) time & constant extra space.
 * <p>
 * Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
 * Output: 2
 * <p>
 * Input:  arr[] = {2, 5, 2}
 * Output: 5
 * <p>
 * Input:  arr[] = {3}
 * Output: 3
 */
public class Q6_Single_Element_Among_Doubles {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(UsingDoubleLoop(arr));
        System.out.println(" ");
        System.out.println(usingHashMap(arr));
        System.out.println(" ");
        System.out.println(usingXor(arr));

    }


    public static int UsingDoubleLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count == 1)
                return arr[i];

        }
        return -1;
    }


    /**
     * this approach takes O(n) time and O(n) Space
     *
     * @param arr
     * @return
     */
    public static int usingHashMap(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        for (var tp : hash.keySet()) {
            if (hash.get(tp) == 1)
                return tp;
        }
        return -1;
    }

    /**
     * This Approach Take O(n) time and O(1) space
     *
     * @param arr
     * @return
     */
    public static int usingXor(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
