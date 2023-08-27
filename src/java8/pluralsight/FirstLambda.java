package java8.pluralsight;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.function.Function;

public class FirstLambda {


    //realisation in anonymous class
    FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean accept(File file) {
            return file.getName().endsWith("Java");
        }
    };

    //the same realisation with lambda expression
    FileFilter filterLambda = (File file) -> file.getName().endsWith("Java");
    FileFilter filterlambda2 = (File file) -> file.getName().endsWith("Java");
    FileFilter filterlambbd3 = (File file) -> file.getName().endsWith("Java");
    FileFilter filterLambda4 = file ->  file.getName().startsWith("Java");

    public static void main(String[] args) {
        Function<Integer, String> convert = String::valueOf;

        String result = convert.apply(5);

        System.out.println(result); // "5"


        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
