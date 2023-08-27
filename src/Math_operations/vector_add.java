package Math_operations;

import java.util.Arrays;

/**
 * Created by kirillk on 05.04.17.
 */
public class vector_add {
    public static void main(String [] args){
        int[] v1 = {10, 11};
        int[] v2 = {30, 33};

        int[] v3 = vector_add(v1, v2);
        System.out.println(Arrays.toString(v3));
    }

    public static int[] vector_add(int[] v1, int[] v2){

        int first = v1[0] + v2[0];
        int second = v1[1] + v2[1];
        int [] add_vector = {first, second};
        return add_vector;
    }
}
