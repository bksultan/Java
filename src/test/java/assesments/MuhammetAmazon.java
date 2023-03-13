package assesments;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MuhammetAmazon {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(-1);
        arr.add(1);
        arr.add(-1);
        arr.add(1);
        System.out.println(count(arr));
//        System.out.println(solve(arr, 3));
    }
        static int solve(List<Integer> weights, int k)
        {
            int length=weights.size();
            int count[]=new int[length];
            count[0]=1;
            int start=0;
            TreeMap<Integer,Integer> treeMap=new TreeMap<>();
            treeMap.put(weights.get(0),treeMap.getOrDefault(weights.get(0),0)+1);
            for (int i=1;i<length;i++)
            {
                int ele= weights.get(i);
                treeMap.put(ele,treeMap.getOrDefault(ele,0)+1);
                while ((treeMap.lastKey()-treeMap.firstKey())>k)
                {
                    treeMap.put(weights.get(start),treeMap.get(weights.get(start))-1);
                    if (treeMap.get(weights.get(start))==0)
                    {
                        treeMap.remove(weights.get(start));
                    }
                    start++;
                }
                count[i]=i-start+1;
            }
            int ans=0;
            for (int ele:count)
            {
                ans+=ele;
            }
            return ans;
        }

    static int minSwaps(List<Integer> arr) {
        return Math.min(getMinSwapFor(arr, 0), getMinSwapFor(arr, 1));
    }

    static int getMinSwapFor(List<Integer> arr, int num) {
        int len = arr.size();
        int totalNumberOfSwaps = 0, currNumberOfSwaps = 0;
        for (int i = len-1; i >= 0; i--) {
            if (arr.get(i) == num) {
                currNumberOfSwaps++;
            } else {
                totalNumberOfSwaps += currNumberOfSwaps;
            }
        }
        return totalNumberOfSwaps;
    }

    public static int count(List<Integer> badges) {
        int count = 0;
        int lastIndex = 0;
        int firstIndex = 0;

        for (int i = 0; i < badges.size(); i++) {
            if (badges.get(i) == -1) {
                if (count == 0) {
                    firstIndex = i;
                }
                lastIndex = i;
                count = count + 1;
            }
        }

        if (count % 2 == 0) {
            return badges.size();
        } else {
            if (firstIndex > badges.size() - lastIndex - 1) {
                return lastIndex + 1;
            } else {
                return badges.size() - firstIndex - 1;
            }
        }

    }
}
