package AdvansedSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseLogger {
    public static String prepareData(int[] num) {
        if (num.length == 1) {
            return num[0] + ":1";
        } else if (num.length == 0 || num == null) {
            return null;
        }
        String result = "" + num[0] + ":";
        int count = 1;

        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                count++;
            } else {
                result += count + ", " + num[i] + ":";
                count = 1;
            }
        }
        result += count;

        return result;
    }

    public static Object[] getOrderBack(String data) {
        List<Integer> res = new ArrayList<>();
        String[] datas = data.split(", ");

        for (int i = 0; i < datas.length; i++) {
            int value = Integer.parseInt(datas[i].substring(0, datas[i].indexOf(':')));
            int count = Integer.parseInt(datas[i].substring(datas[i].indexOf(':') + 1));

            for (int q = 0; q < count; q++) {
                res.add(value);
            }
        }
        return res.toArray();
    }

//    public int[] addValueToArray(int [] nums, int num) {
//        int[] result = new int[nums.length+1];
//        System.arraycopy(nums,0,result,0,nums.length);
//        result[result.length-1] = num;
//        return result;
//    }

    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 3, 6, 6, 39, 39, 39, 39, 39, 39, 39, 39,6,6,6};
        String data = prepareData(nums);
        System.out.println(prepareData(nums));
        System.out.println(Arrays.toString(getOrderBack(data)));
    }
}










































