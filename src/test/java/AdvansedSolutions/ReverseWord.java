package AdvansedSolutions;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(test1("Hello World", ""));
        System.out.println(test2("Hello World"));
        System.out.println(test3("Hello World"));
        System.out.println(test4("Hello World"));
        System.out.println(test5("Hello World"));
        System.out.println(test3("my name is xy"));
        System.out.println(test6("Java Concept Of The Day"));
    }

    public static String test1(String in, String out) {
        return (in.isEmpty()) ? out :
                (in.charAt(0) == ' ')
                        ? out + ' ' + test1(in.substring(1), "")
                        : test1(in.substring(1), in.charAt(0) + out);

    }



    public static String test2(String str) {
        if (str.equals(""))
            return "";
        return test2(str.substring(1)) + str.substring(0, 1);
    }

    public static String test3(String str) {
        StringBuilder out = new StringBuilder();
        for (String word : str.split(" ")) {
            out.append(new StringBuilder(word).reverse().toString());
            out.append(" ");
        }
        return out.substring(0, out.length() - 1);
    }

    public static String test4(String str) {
        String[] arr = str.split(" ");
        String res = "";
        for (int x = 0; x < arr.length; x++) {
            res = res + Stream.of(arr[x].split("")).reduce("", (a, b) -> b + a) + " ";
        }
        return res;
    }

    public static String test5(String str) {
        String reversedWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord += str.charAt(i);
        }
        return reversedWord;
    }

    public static String test6(String str) {
        String[] words = str.split("\\s");
        String outputString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            outputString = outputString + words[i] + " ";
        }
        return outputString;
    }
}





























































