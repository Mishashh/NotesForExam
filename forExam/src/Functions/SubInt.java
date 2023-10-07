package Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        // Create a function that takes a number (a digit) and an array of integers
        // as parameters and returns the indices of the integers in the array
        // which contain the given digit or returns an empty array
        // (if no number in the array contains the given digit)

        // Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] { 1, 11, 34, 52, 61 })));
        // should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] { 1, 11, 34, 52, 61 })));
        // should print: '[]'

        // Note: We are using Arrays.toString() function to print the returned array
        // You could just as well iterate over the array and print its items one by one
    }

    private static int[] findMatchingIndexes(int searchedNumber, int[] listOfNumbers) {
        ArrayList<Integer> outputArrayList = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (Integer.toString(listOfNumbers[i]).contains(Integer.toString(searchedNumber))){
                outputArrayList.add(i);
            }
        }
        int[] outputArray = new int[outputArrayList.size()];
        for (int i = 0; i < outputArrayList.size(); i++) {
            outputArray[i] = outputArrayList.get(i);
        }
        return outputArray;

    }
}
