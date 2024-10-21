import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int p = 0;
        int n = 0;

        Arrays.sort(numbers);
        p= numbers[0]*numbers[1];
        n = numbers[numbers.length-1]*numbers[numbers.length-2];
        answer = (p>n)?p:n;
        return answer;
    }
}