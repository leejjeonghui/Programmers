import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List <Integer> answer = new ArrayList<>();
        int min = Arrays.stream(arr).min().getAsInt();
        
        if(arr.length==1){
            answer.add(-1);
            return answer;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=min){
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}