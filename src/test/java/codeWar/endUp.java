package codeWar;

public class endUp {
    static String word = "hi there";
    static String word1 = "kitten";
    static String word2 = "x";
    static String word3 = "Miracle";






    public static void main(String[] args) {
        System.out.println(endUp(word));
        System.out.println(front22(word1));
        System.out.println(notString(word2));
        System.out.println(everyNth(word3, 2));
    }

    public static String endUp(String str) {
        if (str.length() < 3){
            return str.toUpperCase();
        }
        return str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase();
    }

    public static String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public static String notString(String str) {
        if (str.length() < 3) {
            return "not " + str;
        } else if (str.substring(0, 3).equals("not")) {
            return str;
        } else return "not " + str;
    }

    //Miracle, 2 ->
    //M r c e
    public static String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i += n){
            result += str.substring(i, i+1);
        }
        return result;
    }
}
