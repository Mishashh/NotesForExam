package Functions;

import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {
        // Create a function that takes an array of numbers as parameter
        // and returns an array where the elements are sorted in ascending numerical
        // order
        // When you are done, add a second boolean parameter to the function
        // If it is `true` sort the array descending, otherwise ascending

        // Example:
        System.out.println(Arrays.toString(bubble(new int[] { 34, 12, 24, 9, 5 })));
        // should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[] { 34, 12, 24, 9, 5 }, true)));
        // should print [34, 24, 12, 9, 5]
    }
    public static int[] bubble(int[] numbers){
        Arrays.sort(numbers);
        return numbers;
    }
    public static int[] advancedBubble(int[] numbers, boolean trueFalse){
        if (trueFalse){
            Arrays.sort(numbers);

            for (int i = 0; i < numbers.length / 2; i++) {

                // Storing the first half elements temporarily
                int temp = numbers[i];

                // Assigning the first half to the last half
                numbers[i] = numbers[numbers.length - i - 1];

                // Assigning the last half to the first half
                numbers[numbers.length - i - 1] = temp;
            }
            return numbers;
        }else {
            Arrays.sort(numbers);
            return numbers;
        }
    }
}