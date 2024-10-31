import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] strings = String.valueOf(n).toCharArray();
        for (int i = 0; i < strings.length; i++) {
            answer+=strings[i]-'0';
        }
        return answer;
    }
}