class Solution {
    public int solution(int n, int k) {
      int answer = 0;
        if(n>=10){
          for(int i=10; i<=n; k--){
              i+=10;
          }
        }
        answer = (n*12000)+(k*2000);
        return answer; 
    }
}
