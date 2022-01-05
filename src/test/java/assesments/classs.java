package assesments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class classs {

       // curl -- user user:pass https://website.com/
    // curl -c cookie.txt -d "LoginNmae=someuser


    public static void main(String[] args) {
        String str = "aaabbbnnnssseq";
        System.out.println(countLetter(str));
        System.out.println(biggest(countLetter(str)));
        //System.out.println(deletteLetter(str, "a"));
    }



    public static Map<Character, Integer> countLetter(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (map.containsKey(letter)) {
                int count = map.get(letter);
                map.put(letter, ++count);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }

    public static Character biggest(Map<Character, Integer> letters) {
        int count = 0;
        Character ch = null;
        for (Character keys: letters.keySet()) {
            if (letters.get(keys) > count){
                count = letters.get(keys);
                ch = keys;
            }
        }
        return ch;
    }
}

















