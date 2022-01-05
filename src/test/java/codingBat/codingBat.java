package codingBat;

import java.util.Arrays;

public class codingBat {
    public static void main(String[] args) {
        System.out.println("Deleted character by index : " + deleteChar("Kittien", 5));
        System.out.println("Reversed first and last character : " + reverseFirstAndLast("Code"));
        System.out.println("Copy first three character : " + copyFirstThreeChar("Java"));
        System.out.println("backAround : " + backAround("Hello"));
        System.out.println("or35 : " + or35(10));
        System.out.println("iceHot : " + icyHot(-1, 120));
        System.out.println("in1020 : " + in1020(11, 120));
        System.out.println("sum of array : " + sumOfArray());
        System.out.println("in3050 : " + in3050(10,15));
        System.out.println("delDel : " + delDel("adelHello"));
        System.out.println("mix Start : " + mixStart("mix snacks"));
        System.out.println("max int : " + intMax(5, 2, 9));
        System.out.println("close10 : " + close10(6, -9));
        System.out.println("endsLy : " + endsLy("lovely"));
        System.out.println("seeColor : " + seeColor("redxxx"));
        System.out.println("extraFront : " + extraFront("redxxx"));
    }

    public static String deleteChar(String str, int n) {
        String str1 = "";
        if (str.length() >= n) {
            str1 = String.valueOf(str.charAt(n));
        }
        return str.replace(str1, "");
    }

    public static String reverseFirstAndLast(String str) {
        if (str.length() <= 1) return str;
        String mid = "";
        mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public static String copyFirstThreeChar(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }

    public static String backAround(String str) {
        String lastChar = "";
        if (str.length() >= 1) {
            lastChar = String.valueOf(str.charAt(str.length() - 1));
            return lastChar + str + lastChar;
        } else {
            return lastChar + lastChar + lastChar;
        }
    }

    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public static int sumOfArray() {
        int sum = 0;
        int[] myList = {1, 2, 3, 4, 5};

        for (int i = 0; i < myList.length; i++) {
            sum += myList[i];
        }
        System.out.println(Arrays.stream(myList).sum());
        return sum;
    }

    public static boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40) && (b >= 40 && b <= 50);
    }

    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public static boolean mixStart(String str) {
        if (str.length() >= 3 && str.substring(1, 3).equalsIgnoreCase("ix")) {
            return true;
        }
        return false;
    }

    public static int intMax(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }

    public static int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff
    }

    public static boolean endsLy(String str) {
        if ((str.length() >= 2) && (str.substring(str.length()-2).contains("ly"))) {
            return true;
        }
        return false;
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        } else if (str.startsWith("blue")){
            return "blue";
        }
        return "";
    }

    public static String extraFront(String str) {
        String temp = "";
        if (str.length() >= 2) {
            return temp = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        return str + str + str;
    }


}
