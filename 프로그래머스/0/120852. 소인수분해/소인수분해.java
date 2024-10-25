import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int s) {
        int[] answer = {};
        LinkedHashSet set = new LinkedHashSet<>();
        for (int i = 2; i <= (int)Math.sqrt(s); i++) {
            while (s%i==0){
                set.add(i);
                s/=i;
            }
        }
        
        if(s!=1){
            set.add(s);
        }
        
        ArrayList<Integer> arr= new ArrayList<>(set);
        Collections.sort(arr);
        return arr;
    }
}