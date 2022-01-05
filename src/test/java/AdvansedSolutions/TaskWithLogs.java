package AdvansedSolutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskWithLogs {
// package whatever; // don't place package name!
// A => B => C => ERROR
// A => C => B => no error
// C => B => A => no error
// A => B => B => C => no error

//BBCCAA -no error
//AABCAAA - error
//CCCAAABBBABC - error
//ABCAAAAA - error

// Create a function that outputs all the users who experienced the error. Logs are in
// chronological order from when they occurred

    public static void main(String[] args) {
        //Format: {“Action:UserID”, “Action:UserID”, …}
        String[] logs = {"A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"};

        System.out.println(error(logs));
    }

    public static List<String> error(String[] logs) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < logs.length; i++) {
            int user = Integer.parseInt("" + logs[i].charAt(logs[i].indexOf(":") + 1));
            if (map.containsKey(user)) {
                String current = "" + logs[i].charAt(0);
                String log = map.get(user) + current;
                map.put(user, log);
            } else {
                String current = "" + logs[i].charAt(0);
                map.put(user, current);
            }
        }

        List<String> result = new ArrayList<>();
        for (Integer user : map.keySet()) {
            if (map.get(user).contains("ABC")) {
                result.add("Error");
            } else {
                result.add("Success");
            }
        }
        return result;
    }
}



































