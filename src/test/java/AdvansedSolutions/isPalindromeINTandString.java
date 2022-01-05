package AdvansedSolutions;

import java.util.stream.IntStream;

public class isPalindromeINTandString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome1(1001));
        System.out.println(isPalindrome2("abcba"));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome1(int number) {
        return number == IntStream.iterate(number, i -> i / 10) // divide number to 10          ->  1551 / 10 = 155.1
                .map(n -> n % 10)                               // take the module of number    ->  155.1 % 10 = 1
                .limit(String.valueOf(number).length())         // give limit for number length
                .reduce(0, (a, b) -> a = a * 10 + b);    //
    }

    private static boolean isPalindrome2(String str) {
        String newWord = new String();
        for (int i = str.length() - 1; i >= 0; i--) {
            newWord += str.charAt(i);
        }
        if (str.equals(newWord))
            return true;
        return false;
    }
}





























