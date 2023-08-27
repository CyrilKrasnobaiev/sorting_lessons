package Math_operations;

import java.util.Arrays;

/**
 * Created by kirillk on 04.04.17.
 */
public class vector_multiplication {
    /*
    [a,b] = (ay*bz - az*bz, az*bx - ax*bz, ax*by - ay*bx)
     */
    public static void main(String [] args){
        //we have two vectors
        int [] v1 = {2, 5, 7};
        int [] v2 = {8, 4, 9};

        int[] v3 = vector_multiple(v1, v2);

        System.out.println(Arrays.toString(v3).hashCode());

    }


    public static int[] vector_multiple(int[] v1, int[] v2){
        int first = (v1[1] * v2[2]) - (v1[2] * v2[1]);
        int second = (v1[2] * v2[0]) - (v1[0] * v2[2]);
        int third = (v1[0] * v2[1]) - (v1[1] * v2[0]);
        int [] multiple_vector = {first, second, third};
        int [] multiple_vector_2 = {first, second, third};
        boolean obj = multiple_vector.equals(multiple_vector_2);
        boolean obj2 = multiple_vector == multiple_vector_2;
        System.out.println(Arrays.toString(multiple_vector).hashCode());
        System.out.println(Arrays.toString(multiple_vector_2).hashCode());
        System.out.println(obj);
        System.out.println(multiple_vector_2.toString());
        System.out.println(obj2);
        return multiple_vector;
    }
}
