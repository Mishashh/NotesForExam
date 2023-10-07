package Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]
        int[] numbers = {3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length/2; i++) {
            int holdingNumber = numbers[i];
            numbers[i] = numbers[numbers.length-(i+1)];
            numbers[numbers.length-(i+1)] = holdingNumber;
        }
        System.out.println(Arrays.toString(numbers));
    }
}