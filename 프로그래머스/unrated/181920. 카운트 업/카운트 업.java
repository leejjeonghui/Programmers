import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int start_num, int end_num) {
        int[] answer = {};
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i = start_num; i<end_num+1; i++){
            arr.add(i);
        }
        System.out.println(arr);
        return arr;
    }
}