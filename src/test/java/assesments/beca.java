package assesments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class beca {
    public static String oddEven(int targetNum, int numbers) {
        String result = "";
        ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
        do {
            arrayNumbers.add(numbers % 10);
            numbers /= 10;
        } while (numbers > 0);
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < arrayNumbers.size(); i++) {
            if (map.keySet().contains(arrayNumbers.get(i))) {
                map.put(arrayNumbers.get(i), map.get(arrayNumbers.get(i)) + 1);
            } else {
                map.put(arrayNumbers.get(i), 1);
            }
        }
        if (map.get(targetNum) % 2 == 0) result = "YES";
        else result = "NO";
        return result;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        String targetLine = in.readLine();
        String line;
        int target = Integer.parseInt(targetLine);

        while ((line = in.readLine()) != null) {
            int numbers = Integer.parseInt(line);
            if (line.contains(targetLine)) {
                ArrayList<Integer> arrayNumbers = new ArrayList<>();
                do {
                    arrayNumbers.add(Math.floorMod(numbers , 10));
                    numbers /= 10;
                } while (numbers > 0);

                Map<Integer, Integer> map = new TreeMap<>();

                for (int i = 0; i < arrayNumbers.size(); i++) {
                    if (map.keySet().contains(arrayNumbers.get(i))) {
                        map.put(arrayNumbers.get(i), map.get(arrayNumbers.get(i)) + 1);
                    } else {
                        map.put(arrayNumbers.get(i), 1);
                    }
                }
                if (map.get(target) % 2 == 0) System.out.println("YES");
                else System.out.println("NO");
            } else System.out.println("NO");
        }
    }
}
