import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] emergency) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        
        Integer[] temp = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(temp,Collections.reverseOrder());

        for (int i = 0; i < temp.length; i++) {
            hashMap.put(temp[i],i+1);
        }
        for (int j:
             emergency) {
            arr.add(hashMap.get(j));
        }
        return arr;
    }
}