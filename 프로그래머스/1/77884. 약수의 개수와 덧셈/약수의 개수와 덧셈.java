import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt=0;
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            for(int j =1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    cnt++;
                    if(j!=i/j){
                        cnt++;
                    }
                }
            }         
            list.add(cnt);
            cnt =0;
        }
        
        for(int val : list){
            if(val%2==0){
                answer+=left;
            }else{
                answer-=left;
            }
            left++;
        }
        return answer;
    }
}