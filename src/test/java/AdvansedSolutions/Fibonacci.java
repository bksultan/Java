package AdvansedSolutions;

public class Fibonacci {
    public static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;
        int counter = 0;
        // Iterate till counter is N
        while (counter < N) {
            // Print the number
            System.out.print(num1 + " ");
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2); //recursive method
    }

    public static void main(String args[]) {
        int N = 14;
        System.out.println(fibonacci(N));
    }
}

