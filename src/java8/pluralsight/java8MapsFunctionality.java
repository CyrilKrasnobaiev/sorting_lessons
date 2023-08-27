package java8.pluralsight;

import java.util.HashMap;
import java.util.Map;

public class java8MapsFunctionality {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }

        map.forEach((id, val) -> System.out.println(val));

        map.computeIfPresent(3, (num, val) -> val + num);
        map.get(3);
        System.out.println(map);
        // val33

        map.computeIfPresent(9, (num, val) -> null);
        map.containsKey(9);     // false
        System.out.println(map);

        map.computeIfAbsent(23, num -> "val" + num);
        map.containsKey(23);    // true
        System.out.println(map);

        map.computeIfAbsent(3, num -> "bam");
        map.get(3);             // val33
        System.out.println(map);

        map.remove(3, "val3");
        map.get(3);             // val33
        System.out.println(map);

        map.remove(3, "val33");
        map.get(3);             // null
        System.out.println(map);

        map.getOrDefault(42, "not found");
        System.out.println(map);

        map.merge(9, "val9", String::concat);
        map.get(9);             // val9
        System.out.println(map);

        map.merge(9, "concat", String::concat);
        map.get(9);             // val9concat
        System.out.println(map);

        map.merge(10, "concatnext", String::concat);
        map.get(10);             // val9concat
        System.out.println(map);

    }
}