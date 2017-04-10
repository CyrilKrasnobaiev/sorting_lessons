package Math_operations;

/**
 * Created by kirillk on 10.04.17.
 */
public class PrimitiveTypesAndWrapperClasses extends Main {
    public static void PrimitiveTypes(){
        //Autoboxing, unboxing
        Integer b = 256;
        long c = b;
        int d = (int) c;
        double e = d;
        byte a = (byte) e;
        System.out.println(a);
    }
}
