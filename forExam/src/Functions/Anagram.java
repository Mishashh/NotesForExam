package Functions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("one", "eno"));

    }
    public static boolean isAnagram(String first, String second){
        char[] fir = first.toCharArray();
        char[] sec = second.toCharArray();
        Arrays.sort(fir);
        Arrays.sort(sec);
        return Arrays.equals(fir, sec);
    }
}
