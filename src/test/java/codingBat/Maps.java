package codingBat;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> mapBully = new HashMap<>();
        mapBully.put("a", "candy");
        mapBully.put("b", "dirt");

        Map<String, String> mapShare = new HashMap<>();
        mapShare.put("a", "candy");
        mapShare.put("b", "dirt");
        mapShare.put("c", "xxx");

        Map<String, String> mapAB = new HashMap<>();
        mapAB.put("a", "candy");
        mapAB.put("b", "dirt");

        Map<String, String> topping1 = new HashMap<>();
        topping1.put("ice cream", "peanuts");

        Map<String, String> mapAB4 = new HashMap<>();
        mapAB.put("aaa", "cake");
        mapAB.put("bb", "cake");

        String[] strings = {"a", "b", "a", "b"};
        String[] strings1 = {"this", "and", "that", "and"};
        String[] strings2 = {"man", "moon", "good", "night"};
        String[] strings3 = {"man", "moon", "good", "night", "good", "night"};
        String[] strings4 = {"salt", "tea", "soda", "toast"};
        String[] strings5 = {"salt", "tea", "soda", "toast"};

        System.out.println("mapBully " + mapBully(mapBully));
        System.out.println("mapShare " + mapShare(mapShare));
        System.out.println("mapAB " + mapAB(mapAB));
        System.out.println("topping1 " + topping1(topping1));
        System.out.println("mapAB4 " + mapAB4(mapAB4));
        System.out.println("word0 " + word0(strings));
        System.out.println("wordLen " + wordLen(strings1));
        System.out.println("pairs " + pairs(strings2));
        System.out.println("wordCount " + wordCount(strings3));
        System.out.println("firstChar " + firstChar(strings4));
    }

    public static String wordAppend(String[] strings) {
        for (String str : strings) {
            
        }
        return null;
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String firstChar = str.substring(0, 1);
            if (map.containsKey(firstChar)) {
                String currentValue = map.get(firstChar);
                map.put(firstChar, currentValue + str);
            } else {
                map.put(firstChar, str);
            }
        }
        return map;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
                int count = map.get(str);
                map.put(str, count + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }


    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            map.put(str.substring(0, 1), str.substring(str.length() - 1));
        }
        return map;
    }


    public static Map<String, Integer> wordLen(String[] strings) {
        Set<String> uniqueStrings = new HashSet<>(Arrays.asList(strings));
        Map<String, Integer> map = new HashMap<>();

        for (String key : uniqueStrings) {
            map.put(key, key.length());
        }
        return map;
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aValue = map.get("a");
            String bValue = map.get("b");
            int aLength = aValue.length();
            int bLength = bValue.length();

            if (aLength != bLength) {
                String cValue = (aLength > bLength) ? aValue : bValue;
                map.put("c", cValue);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));

        } if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }


}
