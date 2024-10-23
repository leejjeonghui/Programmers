class Solution {
    public int solution(int n) {
               int answer =0;
        while (n>0){
            int sqrt = (int)Math.sqrt(n);
            for(int i = 2; i<=sqrt;i++){
                if(n%i==0){
                    answer++;
                    break;
                }
            }
            n--;
        }
        return answer;
    }
}