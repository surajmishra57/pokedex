package org.example.dsa.matrix.easy;


/**
 * The type E q 4.
 * 1. Printing Boundary Elements of a Matrix:
 */
public class E_Q4 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        printBoundary(a);

    }

    private static void printBoundary(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == col - 1 || j == 0 || j == row - 1) {
                    System.out.println(a[i][j]);
                }
            }

        }
    }
}
