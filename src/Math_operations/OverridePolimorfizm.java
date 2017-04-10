package Math_operations;

import java.util.Arrays;

/**
 * Created by kirillk on 10.04.17.
 */
public class OverridePolimorfizm extends VectorOperations {
        @Override
        public void vectorAdd(int[] v1, int[] v2){
            int first = v1[0] - v2[0];
            int second = v1[1] - v2[1];
            int [] minus_vector = {first, second};
            System.out.println(Arrays.toString(minus_vector));
        }

        @Override
        //[a,b] = (ax*ax,bx*by)
        public void vectorMultiple(int[] v1, int[] v2){
            int first = (v1[0] / v2[0]);
            int second = (v1[1] / v2[1]);
            int [] divide_vector = {first, second};
            System.out.println(Arrays.toString(divide_vector));
        }
    }

