package assesments;

import java.util.stream.IntStream;

public class ReverseLambda {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        char[] charArray = str.toCharArray();
        IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[(charArray.length - 1) - i])
                .forEach(System.out::print);

        //        String reversed = str.chars()
//                .collect(StringBuilder::new, (b,c) -> b.insert(0,(char)c), (b1,b2) -> b1.insert(0, b2))
//                .toString();

        //System.out.println(charArray);
    }
}
