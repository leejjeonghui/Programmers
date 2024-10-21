import java.util.*;
class Solution {
        public List<Integer> solution(String[] strlist) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        for (String str:
             strlist) {
            result.add(str.length());
        }
        return result;
    }
}