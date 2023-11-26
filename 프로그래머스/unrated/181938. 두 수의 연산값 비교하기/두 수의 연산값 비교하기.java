class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String sum = s1+s2;
        int sum2 = 2*a*b;

        if(Integer.parseInt(sum)<sum2){
            answer = sum2;
        }
        else {
            answer = Integer.parseInt(sum);
        }
        return answer;
    }
}