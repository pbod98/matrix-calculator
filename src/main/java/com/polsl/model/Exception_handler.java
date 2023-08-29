package com.polsl.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Class witch handles exceptions
 *
 */
public class Exception_handler {

    /**
     * Checks if matrices can be added/subtracted
     *
     * @param A first matrix
     * @param B second matrix
     * @throws dimensionException
     */
    public void checkDimensions(Matrix A, Matrix B) throws dimensionException {

        if (A.getX() != B.getX() || A.getY() != B.getY()) {
            throw new dimensionException("Matrices have different dimensions.");
        }
    }

//    public void checkInput(String A, String B) throws inputException {
//
//        String[] rowsA = A.split("\r\n ");
//        String[] valuesA = rowsA.split(" ");
//        String[] rowsB = B.split("\r\n ");
//        String[] valuesB = rowsB.split(" ");
//
//        boolean AisInt, BisInt;
//
//        for (int i = 0; i < valuesA.length; i++) {
//            AisInt = StringUtils.isNumeric(valuesA[i]);
//
//            if (AisInt == false) {
//                throw new inputException("Bad input.");
//            }
//        }
//        for (int i = 0; i < valuesB.length; i++) {
//            BisInt = StringUtils.isNumeric(valuesB[i]);
//
//            if (BisInt == false) {
//                throw new inputException("Bad input.");
//            }
//        }
//    }
}
