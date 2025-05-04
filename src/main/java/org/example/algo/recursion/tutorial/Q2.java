package org.example.algo.recursion.tutorial;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2};
        int index = arr.length - 1;
        ArrayList<Integer> box = new ArrayList<>();
        printSubSequence(arr, 0, box);
    }

    private static void printSubSequence(int[] arr, int index, ArrayList<Integer> box) {
        if (index == arr.length) {
            if (box.isEmpty()) {
                System.out.println("{}");
            }
            box.stream().forEach(System.out::print);
            System.out.println("");
            return;
        }
        box.add(arr[index]);
        printSubSequence(arr, index + 1, box);
        box.remove(Integer.valueOf(arr[index]));
        printSubSequence(arr, index + 1, box);
    }
}
