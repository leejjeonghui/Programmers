import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
       int answer = 0;
       List<Integer> arr= new ArrayList<>();

        for (int i = 1; i <= (int)n/i; i++) {
            if(n%i==0){
             arr.add(i);
                if(i!=n/i){
                    arr.add(n/i);
                }
            } 
        }
        Collections.sort(arr);
        return arr;
    }
}