import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
       int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s1));  
        List<String> list2 = new ArrayList<>(Arrays.asList(s2));
        
        list.retainAll(list2);
        
        return list.size();
    }
}