package Functions;
                        //  Create the usual class wrapper (Factorial) and main method on your own

                        // - Create a function called `calculateFactorial()`
                        //   that returns the factorial of its input
                        //
                        // - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
    public static int calculateFactorial(int Input){
        int factorial = 1;
        for (int i = 1; i <= Input; i++) {
            factorial *= i;
        }

        return factorial;
    }

}
