package org.example.dsa.matrix;

import java.util.Arrays;

/**
 * The type Matrix basic.
 */
public class MatrixBasic {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int row = 3, col = 4;
        /**
         * declare the matrix
         */
        int[][] arr = new int[row][col];

        /**
         * Initialize Matrix
         */
        int[][] brr = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        /**
         * Initialize the Matrix
         */
        int[][] crr = {{9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};

        int[][] drr = {{77, 11, 22, 3},
                {11, 89, 1, 12},
                {32, 11, 56, 7},
                {11, 22, 44, 33}};

        int[][] err = {{1, 6, 10}, {8, 5, 9}, {9, 4, 15}};

        System.out.printf("Access Element In Matrix " + crr[0][2]);
        traverseTheMatrix(brr, 3, 3);
        System.out.println("");
        searchTheMatrix(crr, 2);
        rowWiseSortMatrix(drr);
        System.out.println("");
        System.out.println("");
        colWiseSortMatrix(err);

    }

    private static int[][] transposeOfMatrix(int[][] drr, int row, int col) {
        int[][] trr = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trr[j][i] = drr[i][j];
            }
        }
        return trr;
    }

    private static void colWiseSortMatrix(int[][] drr) {
        int[][] trr = transposeOfMatrix(drr, 3, 3);
        for (int[] val : trr) {
            Arrays.sort(val);
        }
        drr = transposeOfMatrix(trr,3,3);
        traverseTheMatrix(drr,3,3);

    }

    private static void rowWiseSortMatrix(int[][] drr) {
        for (int[] arr : drr) {
            Arrays.sort(arr);
        }
        traverseTheMatrix(drr, 4, 4);
    }

    /**
     * Search the matrix.
     *
     * @param crr the crr
     * @param ele the ele
     */
    public static void searchTheMatrix(int[][] crr, int ele) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (crr[i][j] == ele) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }

        }
    }

    /**
     * Traverse the matrix.
     *
     * @param brr the brr
     * @param row the row
     * @param col the col
     */
    public static void traverseTheMatrix(int[][] brr, int row, int col) {
        for (int i = 0; i < row; i++) {
            System.out.println(" ");
            for (int j = 0; j < col; j++) {
                System.out.print(brr[i][j] + " ");
            }
        }
    }


}
