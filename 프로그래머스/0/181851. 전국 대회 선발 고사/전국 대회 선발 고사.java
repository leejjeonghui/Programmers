import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        ArrayList <Integer> arr = new ArrayList(map.keySet());
        Collections.sort(arr); 
        
        int a = map.get(arr.get(0));
        int b= map.get(arr.get(1));
        int c=map.get(arr.get(2));

        return 10000*a+100*b+c;
    }
}