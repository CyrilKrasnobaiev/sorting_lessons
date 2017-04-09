package Math_operations;

/**
 * Created by kirillk on 05.04.17.
 */
public class MatrixOperations extends Main {
    //method for matrix adding
    public static void matrixAdd(int[][] matrix1, int[][] matrix2) {

        int m = matrix1.length;
        int n = matrix2.length;
        int[][] res = new int[m][n];
        //loop for matrix add operation
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //loop for input of matrix multiple result
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print("[" + (i + 1) + (j + 1) + "]" + res[i][j] + " ");
            }
            System.out.println();
        }
    }

    //multiple matrix method
    public static void matrixMultiple(int[][] matrixOne, int[][] matrixTwo) {
        int strings = matrixOne.length;
        int columns = matrixTwo[0].length;
        int o = matrixTwo.length;
        int[][] res = new int[strings][columns];
        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }
        //loop for input of matrix multiple result
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print("[" + (i + 1) + (j + 1) + "]" + res[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void determinant(int[][] main_matrix) {
        int D = (main_matrix[0][0] * main_matrix[1][1] * main_matrix[2][2]) + (main_matrix[0][1] * main_matrix[1][2] * main_matrix[2][0]) +
                (main_matrix[1][0] * main_matrix[2][1] * main_matrix[0][2]) - (main_matrix[0][2] * main_matrix[1][1] * main_matrix[2][0]) -
                (main_matrix[1][2] * main_matrix[2][1] * main_matrix[0][0]) - (main_matrix[0][1] * main_matrix[2][0] * main_matrix[2][2]);
        System.out.println(D);
    }
}

