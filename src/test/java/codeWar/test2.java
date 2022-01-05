package codeWar;

import java.util.HashMap;
import java.util.Map;

public class test2 {
   static int[]input = {12,11,10,9,10,12,11,12,9};


    static Map countLetter() {
        Map<Integer, Integer> numCount = new HashMap<>();
        for(int i=0; i<input.length; i++){
            if(numCount.containsKey(input[i])){
                numCount.put(input[i], numCount.get(input[i]) +1);
            } else{
                numCount.put(input[i], 1);
            }
        }
        return numCount;
    }
}
