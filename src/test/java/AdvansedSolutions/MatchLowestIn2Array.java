package AdvansedSolutions;

import java.util.Arrays;

public class MatchLowestIn2Array {
    public static void main(String[] args) {
        int[] arra1 = {1, 2, 3, 4, 5};
        int[] arra2 = {6, 5, 2, 9, 8};

        Arrays.sort(arra1);
        Arrays.sort(arra2);
        int min = 0;

        OuterLoop:
        for (int i = 0; i < arra1.length; i++) {
            min = arra1[i];
            for (int b = 0; b < arra2.length; b++) {
                if (min == arra2[b]) {
                    break OuterLoop;
                }
            }
        }
        System.out.println(min);
    }
}















