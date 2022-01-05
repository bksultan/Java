package assesments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class bbec {
    /**
     * Iterate through each line of input.
     */
    //public String line;

    public static int maxIntList(List<Integer> list) {
        return list.stream().min(Integer::compare).get();
    }

    //public static List<Integer> method (String str) {
    //  this.line = str;

    //  return listOfNum;
    // }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        while ((line = in.readLine()) != null) {

            String[] listElements = line.split(" ");
            List<Integer> listOfNum = new ArrayList<>();

            for (int i = 0; i < listElements.length; i++) {
                listOfNum.add(Integer.parseInt(listElements[i]));

            }
            System.out.println(maxIntList(listOfNum));
        }
    }
}

