package Math_operations;

/**
 * Created by kirillk on 05.04.17.
 */
public class Matrix_adding {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2},
                {4, 5}
        };

        int[][] matrix2 = {
                {5, 7},
                {8, 0}
        };


            int m = matrix1.length;
            int n = matrix2.length;
            int[][] res = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

     //   11[3] 12[4]
     //   11[3] 12[5]
        for(int [] a: res) {
            for (int b : a) {
                System.out.print(b + " ");
                System.out.println();
            }
        }
    }
}
