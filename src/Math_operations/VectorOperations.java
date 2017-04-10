package Math_operations;

import java.util.Arrays;

/**
 * Created by kirillk on 10.04.17.
 */
public class VectorOperations {
    //vector's adding operation
    public void vectorAdd(int[] v1, int[] v2){
        int first = v1[0] + v2[0];
        int second = v1[1] + v2[1];
        int [] add_vector = {first, second};
        System.out.println(Arrays.toString(add_vector));
    }

    //[a,b] = (ax*ax,bx*by)
    public void vectorMultiple(int[] v1, int[] v2){
        int first = (v1[0] * v2[0]);
        int second = (v1[1] * v2[1]);
        int [] multiple_vector = {first, second};
        System.out.println(Arrays.toString(multiple_vector));
    }
}
