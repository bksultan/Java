package assesments;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tima {


    public static void main(String[] args) {
        String badge[][] = new String[][] {
                {"Martha", "exit"},
                {"Martha", "enter"},
                {"Martha", "enter"},
                {"Martha", "enter"},
                {"Martha", "enter"},
                {"Martha", "exit"},
                {"Martha", "enter"},
        };

        String horizontal = "";
        String vertical = "";

//badge[0][0] = eto Paul
//badge[0][1] = eto enter

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < badge.length; i++) {
            for (int j = 0; j < badge.length; j++) {
                if (badge[i][j].contains("Martha")) {
                    map.put(i, badge[i][j]);
                }
            }
            System.out.println(map);
        }


    }
}
















