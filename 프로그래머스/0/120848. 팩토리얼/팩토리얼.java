class Solution {
       public int solution(int n) {
       int answer =0;
       int i = 1; 
       while (fact(i)<=n){
           i++;
           answer++;
       }
       return answer;
    }

    public int fact(int num){
        int fact= 1;
        if(num>0){
            fact = num*fact(num-1);
        }
        return fact;
    }
}