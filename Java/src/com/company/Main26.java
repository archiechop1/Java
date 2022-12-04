package com.company;

public class Main26 {
    public static void main(String[] args) {
        int[][] matrixA = new int[][]{{1, 2,}, {3, 4}};
        int[][] matrixB = new int[][]{{5, 6}, {7, 8}};
        int [][] matrixC = new int [][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] matrixD = new int [][] {{10,11,12},{13,14,15}, {16,17,18}};
        for (int i = 0; i < 2; i++) {
            int result1 = matrixA [i][0] * matrixB[0][0]+matrixA[i][1]* matrixB[1][0];
            int result2 = matrixA [i][0] * matrixB [0][1] + matrixA [i][1] * matrixB[1][1];
            System.out.print(result1 +" ");
            System.out.println(result2);
        }

        System.out.println("\n");

        for (int i=0; i<3; i++){
            int result3 =   matrixC[i][0] * matrixD [0][0] +
                            matrixC[i][1] * matrixD[1][0] +
                            matrixC[i][2] * matrixD[2][0];
            int result4 =   matrixC[i][0] * matrixD [0][1] +
                            matrixC[i][1] * matrixD [1][1] +
                            matrixC [i][2] * matrixD [2][1];
            int result5 =   matrixC[i][0] * matrixD [0][2] +
                            matrixC[i][1] * matrixD [1][2] +
                            matrixC [i][2] * matrixD [2][2];
            System.out.print(result3 +"\t");
            System.out.print(result4 +"\t");
            System.out.println(result5);
        }
    }
}