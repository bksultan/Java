package AdvansedSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SumOfIntegers {
    static String str = "good-23bad5"; // -23 + 5 = -18
    static int i = 889669; // 16+9+12+9 = 46 -> 4+6 = 10 -> 1+0 = 1
    static String arrr = "7sad511asd9";

    public static void main(String[] args) {

        System.out.println(sumOfIntInStr(str));
        System.out.println(digitalRoot(i));
        System.out.println(digital_root(i));
        System.out.println(evenPairs(arrr));
    }

    static String evenPairs(String str){
        String[] ars = arrr.split("[^0-9]");
        String result = "false";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < ars.length; i++){
            if (ars[i] != null) {
                list.add(ars[i]);
            }
        }
        list.removeAll(Arrays.asList(""));
        System.out.println(list);
        return null;
    }

    static long sumOfIntInStr(String str) {
        long sum = Pattern.compile("\\p{L}").splitAsStream(str)
                .filter(s -> !s.isEmpty())
                .mapToLong(Long::parseLong)
                .sum();

        return sum;
    }

    static int digitalRoot(int n) {
        int isOneDigit = Integer.toString(Math.abs(n)).trim().length();

        int sum = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        if (isOneDigit > 1) return digitalRoot(sum);

        return sum;
    }

    public static int digital_root(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
        //320 -> 5
    }
}















































