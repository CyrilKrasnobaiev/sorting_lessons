package recursion;

public class RecursionPractice {

    //f(f(f(a)))) ---- a = 20
    //f(a) = 5 + a
    //f(20) = 5 + 20 = 25
    //f(f(f(20))) --- f(f(25))

    //f(25) = 5 + 25 = 30
    //f(f(f(20))) ---- f(f(25)) ---- f(30)

    //f(20) = 5 + 30 = 35

    ////f(f(f(20))) ---- f(f(25)) ---- f(30) ---- 35

    public static int Summation(int n) {
        //base case: We are at the end
        if (n <= 0) {
            return 0;//additive identity property
            //recursive case: keep going
        } else {
            //3 + Summation(3 - 1 = 2)
            //3 + 2 + Summation(2 - 1 = 1)
            //3 + 2 + 1 + Summation(1 - 1 = 0) = 6
            return n + Summation(n - 1);
        }
    }

    //5! -> 5*4*3*2*1
    public static int Factorial (int n) {
        //Base case:
        if (n <=1) {
            return 1;
        }
        //recursive case
        else {
            return n * Factorial(n - 1);
        }
    }

    //5^3 = 5 * 5 * 5
    //5^3 = 5 * 5^2 = 5 * 5 * 5 = 5 * 5 * 5 * 5^1
    public static int Exponentiation(int n, int p) {
        //base case
        if (p <= 0) { // mult identity
            return 1;
        }
        //recursive
        //5 * exponentiation(5,2)
        //5 * 5 * exponentiation(5,1)
        //5 * 5 * 5 * (5,0)
        //5 * 5 * 5 * 1
        else {
            return n * Exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
        Summation(3);
        Factorial(3);
        Exponentiation(5, 3);
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(5, 3));


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        boolean result1 = str1 == str2; // true, as both strings are interned and have the same reference
        boolean result2 = str1 == str3; // false, as the two strings have different references
        boolean result3 = str1.equals(str3); // true, as the values of the two strings are the same
        boolean result4 = str1.equals(str2); // true, as the values of the two strings are the same
        System.out.println(result4);
    }
}
