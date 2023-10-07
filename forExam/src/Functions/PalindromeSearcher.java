package Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {

    public static String[] search(String theSentence) {
        ArrayList<String> listOfAllPossibilities = new ArrayList<>();
        ArrayList<String> listOfPalindroms = new ArrayList<>();
        char[] sentenceInArray = theSentence.toCharArray();

        for (int i = 0; i < sentenceInArray.length; i++) {
            String possibility = "";
            for (int j = i; j < sentenceInArray.length; j++) {
                possibility += sentenceInArray[j];
                if (possibility.length() >= 3) {
                    listOfAllPossibilities.add(possibility);
                }
            }
        }
        for (int i = 0; i < listOfAllPossibilities.size(); i++) {
            if (isPalindrome(listOfAllPossibilities.get(i))) {
                listOfPalindroms.add(listOfAllPossibilities.get(i));
            }
        }


        return listOfPalindroms.toArray(new String[0]);
    }

    public static boolean isPalindrome(String possibility) {
        String toTest = possibility.toLowerCase();
        char[] possibilityCharArray = toTest.toCharArray();

        for (int i = 0; i < possibilityCharArray.length / 2; i++) {
            if (possibilityCharArray[i] != possibilityCharArray[possibilityCharArray.length - (i + 1)]) {
                return false;
            }
        }
        return true;

    }
}