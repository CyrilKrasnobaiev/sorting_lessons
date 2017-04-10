package Math_operations;
import java.util.Arrays;

import static Math_operations.MatrixOperations.determinant;
import static Math_operations.MatrixOperations.matrixAdd;
import static Math_operations.MatrixOperations.matrixMultiple;
import static Math_operations.PrimitiveTypesAndWrapperClasses.PrimitiveTypes;
import static Math_operations.VectorOperations.vectorAdd;
import static Math_operations.VectorOperations.vectorMultiple;


/**
 * Created by kirillk on 06.04.17.
 */
public class Main {

    static final int[][] Matrix1 = {
            {1, 2},
            {4, 5}
    };

    static final int[][] Matrix2 = {
            {5, 7},
            {8, 0}
    };

    static final int[][] MatrixOne = {
            {5, 7},
            {8, 0},
            {7, 8},
            {3, 6}
    };

    static final int[][] MatrixTwo = {
            {5, 7},
            {8, 0}
    };

    //variables for vectorAdd method
    static final int[] V1 = {10, 11};
    static final int[] V2 = {30, 33};

    //variables for determinant method
    static final int[][] MainMatrix = {
            {4, 6, 8},
            {7, 3, 7},
            {4, 9, 2}
    };

    //variables for vectorMultiple method
    static final int [] Vector1 = {2, 5};
    static final int [] Vector2 = {8, 4};


    public static void main(String[] args){
        System.out.println("Matrix Multiple Operation:");
        matrixMultiple(MatrixOne, MatrixTwo);
        System.out.println();
        System.out.println("Matrix Add Operation:");
        matrixAdd(Matrix1,Matrix2);
        System.out.println();
        System.out.println("Matrix Determinant:");
        determinant(MainMatrix);
        System.out.println();
        System.out.println("Vector Multiple Operation");
        System.out.println(Arrays.toString(vectorMultiple(Vector1,Vector2)));
        System.out.println();
        System.out.println("Vector Add Operation");
        System.out.println(Arrays.toString(vectorAdd(V1,V2)));
        System.out.println();
        PrimitiveTypes();
    }
}
