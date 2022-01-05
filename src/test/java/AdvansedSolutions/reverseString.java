package AdvansedSolutions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(test1("Beksultan"));
        System.out.println(test2("Beksultan"));
        System.out.println(test3("Beksultan"));
        System.out.println(test4("Beksultan"));
        System.out.println(test5("Beksultan"));
    }

    public static String test1(String str) {
        return Stream.of(str)
                .map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining());
    }

    public static String test2(String str) {
        int i, len = str.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(str.charAt(i));
        }

        return dest.toString();
    }

    public static String test3(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String test4(String str) {
        String reversedString = "";
        for (int i = str.length(); i > 0; i--) {
            reversedString += str.charAt(i - 1);
        }
        return reversedString;
    }

    public static String test5(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return test5(str.substring(1)) + str.charAt(0);
    }
}


































