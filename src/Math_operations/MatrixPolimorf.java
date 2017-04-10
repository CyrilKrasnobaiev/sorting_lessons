package Math_operations;

/**
 * Created by kirillk on 10.04.17.
 */
public class MatrixPolimorf{
    //D = a11·a22·a33 + a12·a23·a31 + a13·a21·a32 - a13·a22·a31 - a11·a23·a32 - a12·a21·a33
    static void determinant(int[][] main_matrix, int [][] main2_matrix) {
        int determinant1 = (main_matrix[0][0] * main_matrix[1][1] * main_matrix[2][2]) + (main_matrix[0][1] * main_matrix[1][2] * main_matrix[2][0]) +
                (main_matrix[1][0] * main_matrix[2][1] * main_matrix[0][2]) - (main_matrix[0][2] * main_matrix[1][1] * main_matrix[2][0]) -
                (main_matrix[1][2] * main_matrix[2][1] * main_matrix[0][0]) - (main_matrix[0][1] * main_matrix[2][0] * main_matrix[2][2]);
        int determinant2 = (main2_matrix[0][0] * main2_matrix[1][1] * main2_matrix[2][2]) + (main2_matrix[0][1] * main2_matrix[1][2] * main2_matrix[2][0]) +
                (main2_matrix[1][0] * main2_matrix[2][1] * main2_matrix[0][2]) - (main2_matrix[0][2] * main2_matrix[1][1] * main2_matrix[2][0]) -
                (main2_matrix[1][2] * main2_matrix[2][1] * main2_matrix[0][0]) - (main2_matrix[0][1] * main2_matrix[2][0] * main2_matrix[2][2]);
        System.out.println(determinant1);
        System.out.println();
        System.out.println(determinant2);
    }
}
