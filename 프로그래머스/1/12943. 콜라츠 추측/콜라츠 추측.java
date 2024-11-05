class Solution {
    public long solution(long num) {
        long answer = -1;
        long cnt = 0;
        if(num==1){
            answer =0;
            return answer;
        }
    
        while(cnt<500){
            if(num%2==0){
                num/=2;
                 cnt++;
            }else{
                num=(num*3)+1;
                 cnt++;
            }
            if(num==1){
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}