package assesments;

import java.util.Arrays;

public class aaaaaaaaaaaa {
    public static boolean isAna(String word1, String word2) {
        word1 = word1.replace(" ", "").trim().toLowerCase();
        word2 = word2.replace(" ", "").trim().toLowerCase();

        if (word1.length() != word2.length()) {
            return false;
        } else {


            char[] charWord = word1.toCharArray();
            char[] charWord2 = word2.toCharArray();

            Arrays.sort(charWord);
            Arrays.sort(charWord2);
            Arrays.equals(charWord, charWord2);
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println(isAna("listen listen", "silent silent"));

    }
}












