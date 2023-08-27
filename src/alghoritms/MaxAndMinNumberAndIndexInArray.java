package alghoritms;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAndMinNumberAndIndexInArray<N> {

    static int maxNumberIndexInArray(int[] array) {
        int index = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    static int minNumberIndexInArray(int[] array) {
        int index = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    static int maxNumberInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int minNumberInArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int minNumberInList(ArrayList<Integer> testList) {
        int min = testList.get(0);
        for (int i = 1; i < testList.size(); i++) {
            if (min > testList.get(i)) {
                min = testList.get(i);
            }
        }
        return min;
    }

    static int minNumberIndexInList(ArrayList<Integer> testList) {
        int index = 0;
        int min = testList.get(0);
        for (int i = 1; i < testList.size(); i++) {
            if (min > testList.get(i)) {
                min = testList.get(i);
                index = testList.indexOf(min);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {122,232,414,222,12,144,245,678,574,789,234,123};
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(6);
        testList.add(1);
        testList.add(8);
        testList.add(3);
        System.out.println(minNumberInList(testList));
        System.out.println(minNumberIndexInList(testList));

        System.out.println(maxNumberIndexInArray(array));
        System.out.println(minNumberIndexInArray(array));
        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());
        System.out.println(maxNumberInArray(array));
        System.out.println(minNumberInArray(array));
    }
}
