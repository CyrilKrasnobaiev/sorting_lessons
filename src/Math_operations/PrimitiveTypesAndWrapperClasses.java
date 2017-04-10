package Math_operations;

/**
 * Created by kirillk on 10.04.17.
 */
public class PrimitiveTypesAndWrapperClasses {
    public static void PrimitiveTypes(){
        //Autoboxing, unboxing
        Integer b = 100;
        long c = b;
        int d = (int) c;
        double e = d;
        byte a = (byte) e;
        int i = a;
        System.out.println(i + b + " = 200");
    }
}
