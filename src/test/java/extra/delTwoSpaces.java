package extra;

public class delTwoSpaces {
    public static void main(String[] args) {
        String str = "how to   do    in  java   ";
        System.out.println(str.replaceAll(" +"," "));
    }
}
