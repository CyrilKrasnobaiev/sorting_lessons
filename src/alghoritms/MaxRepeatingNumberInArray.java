package alghoritms;

public class MaxRepeatingNumberInArray {

    public static int MaxRepeatingNumber(int[] array) {
        int maxCounter = 0;
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                element = array[i];
            }
        }
        return element;
    }

    public static void main (String[] args) {
        int[] testArray = {1, 5, 6, 3, 1, 4, 6, 7, 3, 2, 1, 6, 8, 9, 5, 4, 3, 2, 6, 7, 8, 2, 1, 3, 5, 3, 5, 6, 7, 1, 2, 1};
        System.out.println(MaxRepeatingNumber(testArray));
    }
}
