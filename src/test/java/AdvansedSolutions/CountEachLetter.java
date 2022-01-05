package AdvansedSolutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountEachLetter {
    static String name = "Hello Java";
    static String name1 = "Java\nJava Java";

    public static void main(String[] args) {
        System.out.println(countLet(name, 'l'));
        System.out.println(countLetter(name));
        System.out.println(countWord(name1, "Java"));
        System.out.println(name1);
    }

    static String countLet(String str, char a) {
        long count = str.chars().filter(ch -> ch == a).count();
        return "Count of character " + a + ": " + count;
    }

    static int countWord(String str, String s) {
        List<String> list = Arrays.asList(str.split("\\s+"));
        int count =0;
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i).equals(s)){
                count++;
            }
        }
        return count;
    }

    static Map countLetter(String str) {
        char[] strArray = name.toCharArray();
        Map<Character, Integer> letterCount = new HashMap<>();
        for(int i=0; i<strArray.length; i++){
            if(letterCount.containsKey(strArray[i])){
                letterCount.put(strArray[i], letterCount.get(strArray[i]) +1);
            } else{
                letterCount.put(strArray[i], 1);
            }
        }
        return letterCount;
    }
}






















































