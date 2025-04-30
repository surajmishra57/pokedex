package org.example.dsa.matrix.medium;

/**
 * Rotate an Image 90 Degree Counterclockwise
 * <p>
 * Input:
 * 1    2    3   4
 * 5   6    7   8
 * 9  10   11  12
 * 13  14  15  16
 * <p>
 * <p>
 * Output:
 * 4  8  12  16
 * 3  7  11   15
 * 2  6  10  14
 * 1   5  9   13
 * <p>
 * <p>
 * Input:
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * <p>
 * <p>
 * Output:
 * 4  8  12
 * 3  7  11
 * 2  6  10
 * 1  5  9
 */
public class M_Q2 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[][] res = counterClockWise90Degree(mat);
        for (int i = 0; i < res.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }

        }
    }

    private static int[][] counterClockWise90Degree(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[j][m - i - 1] = mat[i][j];
            }
        }
        return res;
    }
}

