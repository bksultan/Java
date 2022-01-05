package AdvansedSolutions;

import java.util.*;

public class FindIntegerInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(4);
        list.add(9);

        System.out.println(secondMaxInList(list));
        System.out.println(maxInList(list));
    }

    static Object secondMaxInList(List<Integer> list) {
        return list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
    }

    static int maxInList(List<Integer> list) {
        return list.stream().max(Integer::compare).get();
    }
}

































