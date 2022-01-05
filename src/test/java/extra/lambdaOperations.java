package extra;

import java.util.*;
import java.util.stream.Collectors;

public class lambdaOperations {
    public static long factorial(long n){
        if(n <=1) return 1;
        else return n * factorial(n-1);
    }
    public static String reverseStr1(String str) {
        if (str == null || str.length() <= 1) return str;
        else return reverseStr1(str.substring(1)) + str.charAt(0);
    }
    public static String reverseStr2(String str){
        if (str == null || str.equals("")) return str;
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseStr3(String str){
        String reverseStr = "";
        if (str == null || str.isEmpty()) return str;
        for (int i=str.length()-1; i>=0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }

    public static void main(String[] args) {

        System.out.println(reverseStr1("dsfdsfs dsd dsdsds sdsds"));
        System.out.println(reverseStr2("dsfdsfs dsd dsdsds sdsds"));
        System.out.println(reverseStr3("dsfdsfs dsd dsdsds sdsds"));



        // 1: Remove duplicates from ArrayList with LinkedHashSet
        System.out.println("=======================");
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(6, 3, 6, 7, 8, 9, 1, 2, 2, 3, 3, 4, 5, 6, 5));
        System.out.println(l1);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(l1);
        ArrayList<Integer> l1WithoutDuplicates = new ArrayList<>(linkedHashSet);
        System.out.println(l1WithoutDuplicates);

        // 2: Remove duplicates from ArrayList with JDK 8 - Stream:
        System.out.println("=======================");
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(6, 3, 6, 7, 8, 9, 1, 2, 2, 3, 3, 4, 5, 6, 5));
        List<Integer> l3 = l2.stream().distinct().collect(Collectors.toList());
        System.out.println(l3);

        // 3: Removing (specific condition) from ArrayList with lambda
        System.out.println("=======================");
        List<Integer> l4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        l4.removeIf(number -> number % 2 == 0);
        System.out.println(l4);

        // 4: Removing all Strings with specific values
        System.out.println("=======================");
        List<String> l5 = new ArrayList<>(Arrays.asList("Nazar", "BK", "Ridwan", "Vova", "Nepe", "Gogi"));
        l5.retainAll(Collections.singleton("Nepe"));
        System.out.println(l5);

        // 5: Convert ArrayList to Array
        System.out.println("=======================");
        List<String> l6 = new ArrayList<>(Arrays.asList("Nazar", "BK", "Ridwan", "Vova", "Nepe", "Gogi"));
        Object arrayFroml6[] = l6.toArray();
        System.out.println(Arrays.toString(arrayFroml6));

        // 6: Find the common elements it the two ArrayLists
        System.out.println("=======================");
        List<String> l7 = new ArrayList<>(Arrays.asList("Java", "JS", "Python", "Ruby", "C#", "C"));
        List<String> l8 = new ArrayList<>(Arrays.asList("Java", "JS", "Python", "Ruby", "C#", "C++"));
        System.out.println(l7.equals(l8));
        l7.retainAll(l8);
        System.out.println(l7);

        // 7: Remove that elements whats are not matching
        System.out.println("=======================");
        l8.removeAll(l7);
        System.out.println(l8);
    }
}
