class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int m = (N-1) * M ;
        int n = M-1;
        
        if(M ==1 && N==1){
            answer = 0; 
        }else {
            answer = m+n;
        }
        return answer;
    }
}