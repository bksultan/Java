package AdvansedSolutions;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CapitalizeFirstLetter {
    public static String capitalizeWord1(String str) {
        String words[] = str.split("\\s");
        String capitalizeWord = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        return capitalizeWord.trim();
    }

    public static String capitalizeWord2(String str) {
        StringJoiner joiner = new StringJoiner(" ");
        for (String t : str.split("\\s+")) {
            String s = t.substring(0, 1).toUpperCase() + t.substring(1);
            joiner.add(s);
        }
        String output = joiner.toString();
        return output;
    }

    public static String capitalizeWord3(String str) {
        String output = Arrays.stream(str.split("\\s+"))
                .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
                .collect(Collectors.joining(" "));
        return output;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWord1("my name is khan"));
        System.out.println(capitalizeWord2("I am sonoo jaiswal"));
        System.out.println(capitalizeWord3("I am sonoo jaiswal"));
    }

    /*
        user1
        user2
        user3


     */
}


































