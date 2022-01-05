package Mo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test1 {
    /***
     * You are given an integer N, followed by N lines of input (1 <= N <= 100).
     * Each line of input contains one or several words separated with single spaces.
     * Each word is a sequence of letters of English alphabet containing between 1 and 10 characters, inclusive.
     * The total number of words in the input is between 1 and 100, inclusive.
     * Your task is to reverse each word in each line of input, while preserving the order of words in each line.
     * The lines of your output should not have any trailing or leading spaces.
     * Example
     * input
     * 3
     * RemoteIo is awesome
     * Candidates pass interview
     * best candidates are selected
     * output
     * oIetomeR si emosewa
     * setadidnaC ssap weivretni
     * tseb setadidnac era detceles
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);
        for (int i = 0; i < N; i++) {
            input = br.readLine();
            String[] inputArray = input.split(" ");
            String[] reverseInputArray = new String[inputArray.length];
            StringBuffer strSB;
            String reverseStr = "";
            for (int j = 0; j < inputArray.length; j++) {
                strSB = new StringBuffer(inputArray[j]);
                reverseInputArray[j] = String.valueOf(strSB.reverse());
            }
            for (int q = 0; q < reverseInputArray.length; q++) {
                reverseStr = reverseStr + " " + reverseInputArray[q];
            }
            System.out.println(reverseStr.trim());
        }
    }
}
