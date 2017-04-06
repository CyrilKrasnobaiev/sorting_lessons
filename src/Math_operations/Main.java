package Math_operations;
import java.util.Arrays;

import static Math_operations.AddMatrix.matrixAdd;

/**
 * Created by kirillk on 06.04.17.
 */
public class Main {

    static final int[][] matrix1 = {
            {1, 2},
            {4, 5}
    };

    static final int[][] matrix2 = {
            {5, 7},
            {8, 0}
    };

    static final int[][] matrixOne = {
            {5, 7},
            {8, 0},
            {7, 8},
            {3, 6}
    };

    static final int[][] matrixTwo = {
            {5, 7},
            {8, 0}
    };

    //variables for vectorAdd method
    static final int[] v1 = {10, 11};
    static final int[] v2 = {30, 33};

    //variables for determinant method
    static final int[][] main_matrix = {
            {4, 6, 8},
            {7, 3, 7},
            {4, 9, 2}
    };

    //variables for vectorMultiple method
    static final int [] vector1 = {2, 5};
    static final int [] vector2 = {8, 4};


    public static void main(String[] args){
        System.out.println("Matrix Multiple Operation:");
        MultipleMatrix.matrixMultiple(matrixOne, matrixTwo);


        System.out.println();
        System.out.println("Matrix Add Operation:");
        matrixAdd(matrix1,matrix2);
        System.out.println();
        System.out.println("Matrix Determinant:");
        MatrixDeterminant.determinant(main_matrix);
        System.out.println();
        System.out.println("Vector Multiple Operation");
        System.out.println(Arrays.toString(VectorMultiplication.vectorMultiple(vector1,vector2)));
        System.out.println();
        System.out.println("Vector Add Operation");
        System.out.println(Arrays.toString(AddVector.vectorAdd(v1,v2)));
    }
}
