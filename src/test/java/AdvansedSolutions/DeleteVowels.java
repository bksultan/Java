package AdvansedSolutions;

public class DeleteVowels {
    public static void main(String[] args) {
        System.out.println(test1("Java Concept Of The Day"));
    }

    public static String test1(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }
}


























