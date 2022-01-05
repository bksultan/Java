package extra;

import java.util.ArrayList;
import java.util.List;

public class maxInList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(8);

        System.out.println(maxInList(list));
    }

    static int maxInList(List<Integer> list) {
        return list.stream().max(Integer::compare).get();
    }
}
