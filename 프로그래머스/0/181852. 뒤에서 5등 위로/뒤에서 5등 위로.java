import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        ArrayList<Integer> arr = new ArrayList();
        for(int i=5;i<num_list.length;i++){
            arr.add(num_list[i]);
        }
        return arr;
    
    }
}