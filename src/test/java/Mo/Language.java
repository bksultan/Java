package Mo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Language {
    public static void main(String[] args)
    {
        String str = "Number of words in the string:";
        System.out.print("Number of words in the string: " + count_Words(str)+"\n");
    }

    public static int count_Words(String str)
    {
        str = str.replace(" +", "").trim(); // udalit extra space

        String[] words = str.split(" ");
        int count = 0;
        for(int i = 0; i<words.length; i++){
            if(!words[i].contains("b")){
                count++;
            }
        }
        return count;
    }
}

