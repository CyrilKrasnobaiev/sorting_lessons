package Math_operations;

import java.util.Arrays;

/**
 * Created by kirillk on 04.04.17.
 */
public class VectorMultiplication {

    //[a,b] = (ax*ax,bx*by)
    public static int[] vectorMultiple(int[] v1, int[] v2){
        int first = (v1[0] * v2[0]);
        int second = (v1[1] * v2[1]);
        int [] multiple_vector = {first, second};
        return multiple_vector;
    }
}
