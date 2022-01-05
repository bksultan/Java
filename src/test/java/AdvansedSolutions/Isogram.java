package AdvansedSolutions;

public class Isogram {
    static String str = "DermatogGlyphics";

    public static void main(String[] args) {
        System.out.println(isIsogram(str));
    }

    static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
