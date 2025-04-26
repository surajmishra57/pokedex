package org.example.dsa.matrix;

import java.time.Duration;
import java.time.Instant;

class TimeComplexity {

    static void rowMajor(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Accessing elements row-wise
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]++;
            }
        }
    }

    static void colMajor(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Accessing elements column-wise
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                arr[i][j]++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 1000; // Size of the matrix (n x n)
        int[][] arr = new int[n][n];

        // Time taken by row-major order
        Instant start = Instant.now();
        rowMajor(arr);
        Instant end = Instant.now();
        System.out.println("Row major access time: " + Duration.between(start, end));

        // Time taken by column-major order
        start = Instant.now();
        colMajor(arr);
        end = Instant.now();
        System.out.println("Column major access time: " + Duration.between(start, end));
    }
}

