package AdvansedSolutions;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    static int[] int_array = {2, 3, 6, 8, 90, 6, 8, 90};

    public static void main(String[] args) {
        System.out.println(findDuplicatesInts(int_array));
    }

    static List<Integer> findDuplicatesInts(int[] array) {
        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> numbersMap = new HashMap<>();

        Arrays.stream(array).mapToObj(a ->(numbersMap.containsKey(a))?numbers.add(a):numbersMap.put(a,1)).collect(Collectors.toList());
        return numbers;
    }

    static List<Integer> findDuplicates(int[] array) {
        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int arr : array) {
            if (numbersMap.containsKey(arr)) numbers.add(arr);
            else numbersMap.put(arr, 1);
        }
        int[] ar = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) ar[i] = numbers.get(i);

        return numbers;
    }
}

























