package Math_operations;

/**
 * Created by kirillk on 10.04.17.
 */
public class VectorOperations {
    //vector's adding operation
    public static int[] vectorAdd(int[] v1, int[] v2){
        int first = v1[0] + v2[0];
        int second = v1[1] + v2[1];
        int [] add_vector = {first, second};
        return add_vector;
    }

    //[a,b] = (ax*ax,bx*by)
    public static int[] vectorMultiple(int[] v1, int[] v2){
        int first = (v1[0] * v2[0]);
        int second = (v1[1] * v2[1]);
        int [] multiple_vector = {first, second};
        return multiple_vector;
    }
}
