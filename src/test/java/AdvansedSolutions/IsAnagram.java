package AdvansedSolutions;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(IsAnagram1("dad", "add"));
    }

    /***
     * This method store @param to char[] and will sort it. Then @return true if sorted char[] are equal
     * @param word1 first word
     * @param word2 second word
     * @return
     */
    public static boolean IsAnagram1(String word1, String word2){
        return Arrays.equals(word1.chars().sorted().toArray(), word2.chars().sorted().toArray());
    }
}






































