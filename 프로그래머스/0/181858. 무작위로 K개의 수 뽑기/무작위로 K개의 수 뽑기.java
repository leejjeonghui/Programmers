import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int k){
        int[] answer = new int[k];

        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            set.add(i);
        }
        for (int n : set){
            list.add(n);
        }
        
        if(list.size()>k){
            for (int i = list.size()-1; i >= k; i--) {
                list.remove(list.get(i));
            }
        } else if (list.size() < k) {
            for (int i = list.size(); i < k; i++) {
                list.add(-1);
            }
        }


        return list;
    }

}