package assesments;

import java.util.ArrayList;
import java.util.List;

public class momo {
    public static void main(String[] args) {
        System.out.println("Hello, Py!");
        System.out.println("You're running Java!");

        String word = "GCTCTCTGCCTCTACTTA";
        String word2 = "CTCT"; // udali '!'

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < word.length() - 4; i++) {
            if (word.charAt(i) == 'C') {
                if (word.substring(i, i + 4).equals(word2)) {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }


}
