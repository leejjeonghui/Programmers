import java.util.*;

class Solution {
    public int solution(String[] strArr)  {
        int answer = 0;
        int[] cnt = new int[strArr.length];

        for (String str:
             strArr) {
            cnt[str.length()]++;
        }
        answer = Arrays.stream(cnt).max().getAsInt();
        return answer;
    }
}