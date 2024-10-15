import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        List <Integer> arr= new ArrayList<>();
        for (int i = 0; i < box.length; i++) {
           arr.add( box[i]/n );
        }
        int answer = arr.get(0);
        for (int j = 1; j < arr.size(); j++) {
            answer *= arr.get(j);
        }
        return answer;
    }
}