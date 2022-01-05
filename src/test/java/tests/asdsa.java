package tests;

import java.util.Arrays;

public class asdsa {
    public static void main(String[] args) {
        System.out.println(isScrambleHelper("rkqodlw", "world"));
    }

    public static boolean isScrambleHelper(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        int size = s1.length();
        if (size == 0) {
            return true;
        }


        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (!Arrays.equals(arr1, arr2)) {
            return false;
        }
        for (int i = 1; i < size; i++) {
            String s11 = s1.substring(0, i);
            String s12 = s1.substring(i);
            String s21 = s2.substring(0, i);
            String s22 = s2.substring(i);

            if (isScrambleHelper(s11, s21) && isScrambleHelper(s12, s22)) {
                return true;
            }

            s21 = s2.substring(size - i);
            s22 = s2.substring(0, size - i);
            if (isScrambleHelper(s11, s21) && isScrambleHelper(s12, s22)) {
                return true;
            }
        }
        return false;
    }
}
