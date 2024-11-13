import java.util.*;

class Solution {
    public String solution(String s) {
       StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        
        for(char c : chars) {
            answer.append(c);
        }

        return answer.reverse().toString();
    }
}