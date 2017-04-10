package Math_operations;


import static Math_operations.PrimitiveTypesAndWrapperClasses.PrimitiveTypes;



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

    //variables for vectorAdd method
    static final int[] V_1 = {10, 11};
    static final int[] V_2 = {30, 33};

    //variables for vectorMinus method
    static final int[] VE_1 = {54, 5};
    static final int[] VE_2 = {33, 12};

    //variables for vectorDivide method
    static final int[] VEC_1 = {342, 543};
    static final int[] VEC_2 = {544, 776};


    public static void main(String[] args){
        MatrixOperations obj1 = new MatrixOperations();
        VectorOperations obj2 = new VectorOperations();

        VectorOperations obj3 = new OverridePolimorfizm();

        System.out.println("Matrix Multiple Operation:");
        obj1.matrixMultiple(MATRIX_ONE, MATRIX_TWO);
        System.out.println();

        System.out.println("Matrix Add Operation:");
        obj1.matrixAdd(MATRIX_1,MATRIX_2);
        System.out.println();

        System.out.println("Matrix Determinant:");
        obj1.determinant(MAIN_MATRIX, MAIN2_MATRIX);
        System.out.println();
        obj1.determinant(MAIN_MATRIX);
        System.out.println();

        System.out.println("Vector Multiple Operation");
        obj2.vectorMultiple(VECTOR_1,VECTOR_2);
        System.out.println();

        System.out.println("Vector Minus and Divide Operation");
        obj3.vectorAdd(VE_1, VE_2);
        obj3.vectorMultiple(VEC_1, VEC_2);
        System.out.println();

        System.out.println("Vector Add Operation");
        obj2.vectorAdd(V_1,V_2);
        System.out.println();

        System.out.println("Autoboxing and Unboxing");
        PrimitiveTypes();
    }
}
