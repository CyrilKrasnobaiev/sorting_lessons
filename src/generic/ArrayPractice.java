package generic;

import java.util.Arrays;

public class ArrayPractice {

    public static <E> void printArray(E[] array){
        for(E element : array) {
            System.out.println(element + " ");
        }
    }

    public static void main (String[] args) {

        var intArray2 = new Integer[4];
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] stringArray1 = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        //print our arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        printArray(intArray2);
        printArray(intArray3);

        //retrieve objects
        System.out.println(intArray2[3]);

        //given functions
        Arrays.sort(intArray3);
        System.out.println(intArray2[3]);
        printArray(intArray3);

        printArray(stringArray1);

        //special for loop
        for (String s : stringArray1) {
            System.out.println(s);
        }
    }
}
