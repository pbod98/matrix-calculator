package com.polsl.model;

/**
 * Class which implements calculation logic
 */
public class Calculation {

    /**
     *
     * @param input Values given by the user
     * @return Matrix initialized with the values.
     */
    public Matrix getMatrix(String input) {
        
        String[] rows = input.split("\r\n");

        int y = rows[0].split(" ").length;
        int x = rows.length;
        int arr[][] = new int[x][y];

        for (int i = 0; i < x; i++) {
            String[] values = rows[i].split(" ");

            for (int j = 0; j < y; j++) {
                arr[i][j] = Integer.valueOf(values[j]);
            }
        }

        return new Matrix(x, y, arr);
    }

    /**
     *
     * @param A first matrix
     * @param B second matrix
     * @return sum of matrices
     */
    public Matrix add(Matrix A, Matrix B) {

        final int[][] a = A.getValues();
        final int[][] b = B.getValues();
        final int[][] result = new int[A.getX()][A.getY()];

        for (int i = 0; i < A.getX(); i++) {
            for (int j = 0; j < A.getY(); j++) {
                result[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return new Matrix(A.getX(), A.getY(), result);
    }

    /**
     *
     * @param A first matrix
     * @param B second matrix
     * @return difference of matrices
     */
    public Matrix subtract(Matrix A, Matrix B) {

        final int[][] a = A.getValues();
        final int[][] b = B.getValues();
        final int[][] result = new int[A.getX()][A.getY()];

        for (int i = 0; i < A.getX(); i++) {
            for (int j = 0; j < A.getY(); j++) {
                result[i][j] = (a[i][j] - b[i][j]);
            }
        }
        return new Matrix(A.getX(), A.getY(), result);
    }
}
