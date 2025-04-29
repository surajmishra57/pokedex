package org.example.dsa.matrix.basic;

/**
 * The type B q 2.
 */
public class B_Q2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] A = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int[][] B = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int[][] C = new int[4][3];
        add(A, B, C);
        int row = C.length;
        int col = C[0].length;
        for (int i = 0; i < row; i++) {
            System.out.println(" ");
            for (int j = 0; j < col; j++) {
                System.out.print(C[i][j] + " ");
            }

        }
    }

    /**
     * Add.
     *
     * @param A the a
     * @param B the b
     * @param C the c
     */
    public static void add(int[][] A, int[][] B, int[][] C) {
        int row = A.length;
        int col = B[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }
}
