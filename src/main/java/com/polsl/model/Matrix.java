package com.polsl.model;

/**
* Class which represents a matrix
*/
public class Matrix {

    private int x, y;
    private int[][] arr;
    
     /**
     * Constructor of a matrix
     * @param x     Number of rows
     * @param y     Number of columns
     * @param arr   Values of a matrix
     */
    public Matrix(int x, int y, int[][] arr) {
        this.x = x;
        this.y = y;
        this.arr = arr;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[][] getValues() {
        return arr;
    }

    /**
    * Converts ArrayList of values to String
    * @return String which represents data of a matrix
    */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                builder.append(arr[i][j]).append(" ");
            }
            builder.append("\n");
        }
        
        return builder.toString();
    }
}
