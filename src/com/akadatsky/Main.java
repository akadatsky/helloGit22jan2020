package com.akadatsky;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        int[][] matrix2 = {
                {1,2,3,4},
                {1,2,55,4},
                {2,3,5,7}
        };

        //System.out.println(matrix2[1][2]);

        System.out.println(Arrays.toString(matrix2));

        printMatrix(matrix2);

        int[] testArray = matrix2[1];

        System.out.println("================");
        System.out.println(Arrays.toString(testArray));
*/
        int[][] matrix = new int[3][4];
        printMatrix(matrix);
        System.out.println("================");
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        printMatrix(matrix);

        /*
        int[][][] arrX3 = new int[3][3][4];
        int count = arrX3[0][0].length;
        arrX3[0][1][3] = 123;
         */

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }

}
