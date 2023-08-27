package arraypractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.print(item);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main (String[] args) {

        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] stringArray1 = {"Bananas", "apples", "pears"};
        Arrays.sort(stringArray1,String::compareToIgnoreCase);//sort by ignoring case sensitivity

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
