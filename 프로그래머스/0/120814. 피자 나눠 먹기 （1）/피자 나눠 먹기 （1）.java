class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n<=7){
            answer= 1;
        }
        else if (n>7){
            for(int i=0; i<n ; i+=7){
                answer++;
            }
        }
        
        return answer;
    }
}