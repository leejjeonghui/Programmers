class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long j =1;
        for(int i =0; i<count;i++){
            answer+= price*j;
            j++;
        }
       
        answer = money>answer?0:(answer-money);
        return answer;
    }
}