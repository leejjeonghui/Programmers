class Solution {
    public int solution(int n) {
      int answer = 2;
            double sr= (int)Math.sqrt(n);
            if(sr*sr == n){
                answer =1;
            }
            return answer;
    }
}