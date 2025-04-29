package org.example.dsa.matrix.basic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The type B q 5.
 */
public class B_Q5 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] mat = {{5, 4, 7},
                {1, 3, 8},
                {2, 9, 6}};
        sortMatrixUsingNaiveApproach(mat);
        showMatrix(mat);
        System.out.println("");
        sortMatrixWithOutUsingApproach(mat);
        showMatrix(mat);
    }

    /**
     * Time Complexity O((m * n) x (m x n))
     * Space Complexity 0(1)
     *
     * @param data
     */
    public static void sortMatrixWithOutUsingApproach(int[][] data) {
        int row = data.length;
        int col = data[0].length;
        int size = row * col;

        // Loop to sort the matrix
        // using Bubble Sort
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {

                // Condition to check
                // if the Adjacent elements
                if (data[j / col][j % col] > data[(j + 1) / col][(j + 1) % col]) {
                    // Swap if previous value is greater
                    int temp = data[j / col][j % col];

                    data[j / col][j % col] = data[(j + 1) / col][(j + 1) % col];

                    data[(j + 1) / col][(j + 1) % col] = temp;
                }
            }
        }

    }

    /**
     * Sort matrix using a naive approach.
     *
     * @param mat the mat Time Complexity: O(mnlog2mn) Auxiliary Space: O(mn) for the auxiliary 1D array.
     */
    public static void sortMatrixUsingNaiveApproach(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res.add(mat[i][j]);
            }
        }
        Collections.sort(res);
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = res.get(k);
                k++;
            }
        }
    }

    /**
     * Show matrix.
     *
     * @param mat the mat
     */
    public static void showMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            System.out.println(" ");
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }
}
