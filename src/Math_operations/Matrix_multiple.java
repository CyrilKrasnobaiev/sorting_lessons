package Math_operations;

/**
 * Created by kirillk on 04.04.17.
 */
public class Matrix_multiple {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {5, 7},
                {8, 0},
                {7, 8},
                {3, 6}
        };

        int[][] matrix2 = {
                {5, 7},
                {8, 0}
        };


        int strings = matrix1.length;
        int columns = matrix2[0].length;
        int o = matrix2.length;
        int[][] res = new int[strings][columns];

        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

            for(int [] a: res)
            {
                for(int b: a)
                    System.out.print(b+" ");
                System.out.println();
            }

    }
}
