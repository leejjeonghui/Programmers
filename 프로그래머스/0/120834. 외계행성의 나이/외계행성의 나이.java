import java.util.*;
class Solution {
    public String solution(int age) {
    
        HashMap<Integer,Character> map = new HashMap<Integer,Character>();
        
        String strAge = String.valueOf(age);
        String answer = "";
        
        for (int i = 0; i < 10; i++) {
            map.put(i,(char)(97+i));
        }
        for (int i = 0; i < strAge.length(); i++) {
            answer += map.get(Character.getNumericValue(strAge.charAt(i)));
        }

        return answer;
    }
}