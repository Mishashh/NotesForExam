package Functions;
                    // Create the usual class wrapper (Sum) and main method on your own

                    // Write a function called `sum()` that returns the sum of numbers from zero
                    // to the given parameter
                    //
                    // Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15
public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
    public static int sum(int Input){
        int sum = 0;
        for (int i = 0; i <= Input; i++) {
            sum += i;
        }

        return sum;
    }

}
