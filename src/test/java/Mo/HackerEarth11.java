package Mo;

import java.util.ArrayList;

public class HackerEarth11 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> mylist = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Python");
        StringBuilder sb3 = new StringBuilder("Scala");
        StringBuilder sb4 = new StringBuilder("Angular");

        mylist.add(sb1);
        mylist.add(sb2);
        mylist.add(sb3);
        mylist.add(sb4);

        mylist.remove(1);

        for (StringBuilder element: mylist)
            System.out.println(element);
            mylist.remove(sb3);
            mylist.remove(new StringBuilder("Angular"));
            for (StringBuilder element: mylist)
                System.out.println(element);
        }
}
