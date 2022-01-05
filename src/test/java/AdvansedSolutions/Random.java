package AdvansedSolutions;

public class Random {
    public static String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static java.util.Random rnd = new java.util.Random();
    public static String word;

    public static void main(String[] args) {
        System.out.println(getRandomUppercaseLetters(5));
    }

    public static String getRandomUppercaseLetters(int count) {
        for (int i = 0; i < count; i++) {
            char c = upperCaseLetters.charAt(rnd.nextInt(upperCaseLetters.length()));
            word += c;
        }
        return word;
    }
}
