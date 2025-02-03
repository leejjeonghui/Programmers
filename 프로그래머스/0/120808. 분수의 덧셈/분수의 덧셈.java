class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int de = denom1*denom2;
        int nu = (numer1*denom2)+(numer2*denom1);
        
        int gcd = getGcd(nu,de);
        
        answer[0] = nu/gcd;
        answer[1] = de/gcd;
        
        return answer;
    }
    
    public int getGcd(int a,int b){
        while(b!=0){
            int temp = b;
            b =a%b;
            a= temp;
        }
        return a;
    }
    
}