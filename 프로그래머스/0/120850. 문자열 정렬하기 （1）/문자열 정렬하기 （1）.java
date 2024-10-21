import java.util.*;

class Solution {
       public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i <my_string.length() ; i++) {
            if(Character.isDigit(my_string.charAt(i))){
                answer.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        Collections.sort(answer);
        return answer;
    }
}