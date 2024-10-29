import java.util.*;

class Solution {
    public int solution(String[] strArr)   {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length(); 
            if(map.containsKey(len)){
                map.put(len,map.get(len)+1);
            }else {
                map.put(len,1);
            }
        }
        
       answer = Collections.max(map.values());
        
        return answer;
    }
}