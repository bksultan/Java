package assesments;

import java.util.Scanner;

public class nssss {
    interface StringFunc {
        String func(String n);
    }
    public static void main(String args[]) {
        StringFunc reverse = (str) -> {   // lambda expression
            String result = "";
            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Lambda reversed is: " + reverse.func("Lambda Expression"));

    }
}
