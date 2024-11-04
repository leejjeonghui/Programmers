
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if ((n - 1) % i == 0) {
                answer = i;
                flag = true;
                break;
            }

        if (!flag)
            answer = n - 1;


        return answer;
    }
}