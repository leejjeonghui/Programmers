import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int start, int end_num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = start; i>end_num-1;i--){
            arr.add(i);
        }
        return arr;
    }
}