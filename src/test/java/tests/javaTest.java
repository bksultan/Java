package tests;

public class javaTest {
    public static void fizzBuz(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(i % 15 != 0 ? i % 5 != 0 ? i % 3 != 0 ? i : "Fizz" : "Buzz" : "FizzBuzz");// i use ternary operator
            //if my i module of 15 equal 0  i will print out Fizzbuzz
            //if if my i module of 3 equal 0  i will print out Fizz
            //if my i module of 5 equal 0  i will print out Buzz

            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (n % 5 == 0) {
                System.out.println("Buzz");
            }
            if (n % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            if (n % 7 == 0) {
                System.out.println("Foot");//but the problem is if n ==21 21 is devided by 3 and 7 without reminder it will print out first "Fizz"         }
            }

            //time comlexity is O(n)
            //we can use switch statement
            // or we can use if else statement
        }
    }

    public static void main(String[] args) {
        fizzBuz(20);// one n ruuuuuun
    }
}
