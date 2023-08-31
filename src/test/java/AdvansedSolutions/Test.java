package AdvansedSolutions;

//Write a method that will revert a sentense and strip junk
//example:
//Input: "Testing   is the best'"
//Output:
//"best is the testing"


// Testing   is the best' -> equalize the case
// Split sentence into words
// Remove unwanted/none alphanumeric charachters
// Reverse words

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //System.out.println(cleanUp("Testing   is the best' '"));
        System.out.println(reverse("Testing   is the best' '"));
    }


    private static String cleanUp (String input) {
        String lowered = input.toLowerCase(); //testing   is the best'
        String cleaned = lowered.replaceAll("\\W", " ");
        String finished = cleaned.replaceAll("\\s+", " ").trim();

        return finished;
    }

    public static String reverse (String input) {
        input = cleanUp(input);
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i];
        }

        List<String> sentence = new ArrayList<>(Arrays.asList(words));
        Collections.reverse(sentence);

        return String.join(" ", sentence);
    }
}
