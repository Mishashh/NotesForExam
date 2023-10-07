package Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
            // Create a function that takes an array of numbers as a parameter
            // and returns an array of integers where every integer is unique
            // (occurs only once)

            // Example
            System.out.println(Arrays.toString(findUniqueItems(new int[] { 1, 11, 34, 11, 52, 61, 1, 34 })));
            // should print: `[1, 11, 34, 52, 61]`
    }
    public static int[] findUniqueItems(int[] input){
        ArrayList<Integer> outputArrayList = new ArrayList<Integer>();

        for (int i = 0; i < input.length; i++) {
            if (!outputArrayList.contains(input[i])){
                outputArrayList.add(input[i]);
            }
        }
        int[] outputArray = new int[outputArrayList.size()];
        for (int i = 0; i < outputArrayList.size(); i++) {
            outputArray[i] = outputArrayList.get(i);
        }
        return outputArray;
    }
}
