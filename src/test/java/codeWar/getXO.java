package codeWar;

import java.util.regex.Pattern;

public class getXO {
    static String str = "xxxXodasdasoOo";
    static String num = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";

    public static void main(String[] args) {
        System.out.println(getXO(str));
        System.out.println(getXO1(str));
    }

    static boolean getXO (String str) {
        char x = 'x';
        char o = 'o';

        long xCount = str.toLowerCase().chars()
                .filter(a -> a == x)
                .count();

        long yCount = str.toLowerCase().chars()
                .filter(a -> a == o)
                .count();

        return xCount == yCount || (!str.toLowerCase().contains("x") && !str.toLowerCase().contains("o"));
    }

    public static boolean getXO1 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }

}
