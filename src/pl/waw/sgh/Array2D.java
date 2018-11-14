package pl.waw.sgh;

public class Array2D {
    public static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.println();
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
        }
        sum(arr2d);
        System.out.println("Sum of all the elements in table = " + sum(arr2d));
        System.out.println("SUMS OF ROWS");
        for (int row = 0; row < arr2d.length; row++) {
            int sum;
            sum = 0;
            for (int col = 0; col < arr2d[row].length; col++) {
                sum += arr2d[row][col];
            }

            System.out.println("The sum for row " + (row + 1) + " = " + sum);
        }
        System.out.println("SUMS OF COLS");
        for (int col = 0; col < arr2d.length; col++) {
            int sum;
            sum = 0;
            for (int row = 0; row < arr2d[col].length; row++) {
                sum += arr2d[row][col];
            }
            System.out.println("The sum for col " + (col + 1) + " = " + sum);
        }

    }

    public static int sum(int[][] arr2d) {
        int arr2dSum = 0;
        for (int i = 0; i < arr2d.length; i++) {

            for (int j = 0; j < arr2d.length; j++) {
                arr2dSum += arr2d[i][j];
            }

        }

        return arr2dSum;

    }
    /*public static int rowSum(int [][] arr2d) {
        int rowSum = 0;

            for (int j=0; j<arr2d.length; j++){
                rowSum += arr2d[0][j];


        }
        System.out.println(rowSum);
            return rowSum;

    }*/


}

