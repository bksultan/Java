package AdvansedSolutions;

import java.util.Arrays;

public class n {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        processNumbers(numbers);
    }

    public static void processNumbers(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        if(input == null || input.length <= 1){
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("Result is : " + Arrays.toString(input));
    }
}
