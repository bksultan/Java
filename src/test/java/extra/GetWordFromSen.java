package extra;

public class GetWordFromSen {
    public static void main(String[] args) {
        String sentence = "11299 N. Illinois Street Carmel, IN 46032";
        String[] words = sentence.replaceAll("\\p{Punct}+", "").trim().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("Carmel")) System.out.println(words[i]);
        }
    }
}
