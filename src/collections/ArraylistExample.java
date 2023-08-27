package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArraylistExample {

    public static int isConsecutive(ArrayList<Integer> list) {
        var run = 1;
        for (var i = 0; i < list.size(); ++i) {   // n is the size of array
            if (i + 1 < list.size() && list.get(i) == list.get(i + 1)) {
                run++;        // increment run if consecutive elements are equal
            } else {
                System.out.println(run);
                run = 1;      // reset run if they are not equal
            }
        }
        return run;
    }


    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        var n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        var arrayInteger = new ArrayList<Integer>();
        while(n > 0) {
            var remainder = n%2;
            n /= 2;
            arrayInteger.add(remainder);
        }
        System.out.println(arrayInteger);
        System.out.println(isConsecutive(arrayInteger));
    }
}
