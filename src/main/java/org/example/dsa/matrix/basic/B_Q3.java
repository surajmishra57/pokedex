package org.example.dsa.matrix.basic;

public class B_Q3 {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{4, 3}, {2, 1}};
        int[][] m3 = new int[2][2];
        subtraction(m1, m2, m3);
        int row = m1.length;
        int col = m2[0].length;
        for (int i = 0; i < row; i++) {
            System.out.println("");
            for (int j = 0; j < col; j++) {
                System.out.print(m3[i][j] + " ");
            }

        }
    }

    private static void subtraction(int[][] m1, int[][] m2, int[][] m3) {
        int row = m1.length;
        int col = m1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m3[i][j] = m1[i][j] - m2[i][j];
            }
        }
    }
}
