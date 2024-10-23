import java.util.Arrays;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        for (char str : my_string.toCharArray()) {
            set.add(str);
        }
        
        for (char a : set) {
            answer+=a;
        }
        
        return answer;
    }
}