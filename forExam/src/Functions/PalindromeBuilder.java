package Functions;

public class PalindromeBuilder {
        //Create a function named build()
        // following your current language's style guide.
        // It should take a string, create a palindrome from it and then return it.

        //System.out.println(build("Miluju Tě "));
    public static String build(String word){
        char[] wordInArray = word.toCharArray();
        for (int i = word.length(); i > 0; i--) {
            word = word + wordInArray[i - 1];
        }

        return word;
    }
}
