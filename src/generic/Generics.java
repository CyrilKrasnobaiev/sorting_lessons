package generic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Generics {

    public static <T extends Comparable <T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 3));
        System.out.println(findMax(3, 2));

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("hello", "there"));

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("bober", "apple");
        hashMap.put("astro", "banana");
        hashMap.put("goose", "orange");
        hashMap.put("zoro", null);
        hashMap.put(null, "black");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "apple");
        treeMap.put(1, "banana");
        treeMap.put(2, "orange");

        System.out.println(hashMap); // {1=banana, 2=orange, 3=apple}
        System.out.println(treeMap); // {1=banana, 2=orange, 3=apple}

        int n=70;
        int m=30;
        Operation op = ()->{

            //n=100;
            return m+n;
        };
        //n=100;
        System.out.println(op.calculate());

//        Generics k = new Generics();
//        System.out.println(findMax(k,k));

        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    interface Operation{
        int calculate();
    }

//    @Override
//    public int compareTo(Object o) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

}
