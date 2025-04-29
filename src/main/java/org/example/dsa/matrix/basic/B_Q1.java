package org.example.dsa.matrix.basic;

/**
 * The type B q 1.
 */
public class B_Q1 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] mat = {{10, 51, 9},
                {14, 20, 21},
                {30, 24, 43}};
        int target = 14;
        System.out.println(searchInMatrix(mat, target));
    }

    /**
     * Search in matrix string.
     *
     * @param mat    the mat
     * @param target the target
     * @return the string
     */
    public static String searchInMatrix(int[][] mat, int target) {
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == target)
                    return "Found";
            }

        }
        return "No Found";
    }
}
