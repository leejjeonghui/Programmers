class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String sum = s1+s2;
        String sum2 = s2+s1;

        if(Integer.parseInt(sum)<Integer.parseInt(sum2)){
            answer = Integer.parseInt(sum2);
        }
        else {
            answer = Integer.parseInt(sum);
        }
        return answer;
    }
}