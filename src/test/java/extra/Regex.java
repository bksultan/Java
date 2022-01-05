package extra;

import java.util.Arrays;

public class Regex {
    static String s1 = "good-23bad5";

    public static void main(String[] args) {
        splitBySpecialCharacterAndNumber();
    }

    public static void splitBySpecialCharacterAndNumber() {
        String array[] = s1.split("-?\\d+");
        System.out.println(Arrays.toString(array));
    }
}
