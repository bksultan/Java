package Yerkenaz;

public class test4 {
    public static void main(String[] args) {

        String str = "Bob", empty = "";

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            empty = empty + str.charAt(i);

        if (str.equals(empty))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");

    }
}

