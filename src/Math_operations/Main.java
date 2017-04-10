package Math_operations;
import java.util.Arrays;


import static Math_operations.MatrixOperations.matrixAdd;
import static Math_operations.MatrixOperations.matrixMultiple;
import static Math_operations.MatrixPolimorf.determinant;
import static Math_operations.PrimitiveTypesAndWrapperClasses.PrimitiveTypes;
import static Math_operations.VectorOperations.vectorAdd;
import static Math_operations.VectorOperations.vectorMultiple;


/**
 * Created by kirillk on 06.04.17.
 */
public class Main {

    static final int[][] MATRIX_1 = {
            {1, 2},
            {4, 5}
    };

    static final int[][] MATRIX_2 = {
            {5, 7},
            {8, 0}
    };

    static final int[][] MATRIX_ONE = {
            {5, 7},
            {8, 0},
            {7, 8},
            {3, 6}
    };

    static final int[][] MATRIX_TWO = {
            {5, 7},
            {8, 0}
    };

    //variables for vectorAdd method
    static final int[] V1 = {10, 11};
    static final int[] V2 = {30, 33};

    //variables for determinant method
    static final int[][] MAIN_MATRIX = {
            {4, 6, 8},
            {7, 3, 7},
            {4, 9, 2}
    };

    static final int[][] MAIN2_MATRIX = {
            {5, 6, 89},
            {7, 8, 78},
            {4, 96, 2}
    };

    //variables for vectorMultiple method
    static final int [] VECTOR_1 = {2, 5};
    static final int [] VECTOR_2 = {8, 4};


    public static void main(String[] args){
        System.out.println("Matrix Multiple Operation:");
        matrixMultiple(MATRIX_ONE, MATRIX_TWO);
        System.out.println();
        System.out.println("Matrix Add Operation:");
        matrixAdd(MATRIX_1,MATRIX_2);
        System.out.println();
        System.out.println("Matrix Determinant:");
        determinant(MAIN_MATRIX, MAIN2_MATRIX);
        System.out.println();
        System.out.println("Vector Multiple Operation");
        System.out.println(Arrays.toString(vectorMultiple(VECTOR_1,VECTOR_2)));
        System.out.println();
        System.out.println("Vector Add Operation");
        System.out.println(Arrays.toString(vectorAdd(V1,V2)));
        System.out.println();
        PrimitiveTypes();
    }
}
