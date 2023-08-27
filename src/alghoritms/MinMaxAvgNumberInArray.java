package alghoritms;

public class MinMaxAvgNumberInArray {

    public static double[] fillArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    public static double minNumberInArray(int length) {
        double[] testArray = fillArray(length);
        double min = testArray[0];
        for (int i = 1; i < testArray.length; i++) {
            if (min > testArray[i]) {
                min = testArray[i];
            }
        }
        return min;
    }

    public static double maxNumberInArray(int length) {
        double[] testArray = fillArray(length);
        double max = testArray[0];
        for (int i = 1; i < testArray.length; i++) {
            if (max < testArray[i]) {
                max = testArray[i];
            }
        }
        return max;
    }

    public static double avgNumberInArray(int length) {
        double[] testArray = fillArray(length);
        double avg = 0;
        for (double v : testArray) {
            avg += v / testArray.length;
        }
        return avg;
    }


    public static void main(String[] args) {
        System.out.println(minNumberInArray(100));
        System.out.println(maxNumberInArray(150));
        System.out.println(avgNumberInArray(200));
    }
}
