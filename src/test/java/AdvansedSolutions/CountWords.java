package AdvansedSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) {
        String str = "This this is is done by John John";

        System.out.println("countWord: " + countWord(str));
        System.out.println("countWord1: " + countWord1(str));
    }

    static Map<String, Integer> countWord(String str){
        List<String> names = Arrays.asList(str.split("\\s+"));

        Map<String, Integer> map = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(val -> 1)));
        return map;
        /*
            Collecting the outcome in a Map using Collectors.groupingBy()
            with each unique word treated as a key and it's occurrence count as the value

            identity = identity. The method identity returns an identity function. An identity function is a "function that returns
            the passed arguments" and is the identity element in the combination of functions.
            In other words, it's like the number 1 (although it depends on the area of the context, but sensuously).

            Collectors.summingInt() is responsible for summing integer values using a given mapper function.
            Our mapper function is simply incrementing the value by 1 for each occurrence.
        */
    }

    static Map<String, Integer> countWord1(String str){
        String[] split = str.split(" ");

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for (int i=0; i<split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        return map;
    }
}
