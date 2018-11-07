package pl.waw.sgh;

import java.util.Arrays;

public class Array2D {
    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static int[] sumRow(int[][] arr2d) {
        int[] rowSum = new int[arr2d.length];
        for (int i = 0; i < arr2d.length; i++) {
            rowSum[i] = 0;
            for (int j = 0; j < arr2d[i].length; j++) {
                rowSum[i] += arr2d[i][j];
            }
        }

        return rowSum;
    }

    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
            }
        }

        arr2d[0][0] = 1;
        arr2d[0][2] = 4;
        arr2d[1][1] = 2;
        arr2d[2][0] = 9;
        arr2d[3][2] = 5;
        arr2d[4][3] = 6;
        arr2d[2][4] = 7;
        arr2d[4][4] = 7;

        //System.out.println(Arrays.deepToString(arr2d));
        for (int[] row : arr2d) {
            printRow(row);
            sumRow(arr2d);
        }
    }
}

