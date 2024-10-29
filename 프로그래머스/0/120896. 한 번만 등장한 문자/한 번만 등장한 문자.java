import java.util.List;
import java.util.*;

class Solution {
    public String solution(String s) {
        List<String> characters = Arrays.asList(s.split(""));
        List<Integer> integers = new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        
        Collections.sort(characters);

        for (int i = 0; i < characters.size(); i++) {
            int preq = Collections.frequency(characters,characters.get(i));
            integers.add(preq);
        }

        for (int j = 0; j < integers.size(); j++) {
            if(integers.get(j)==1){
                sb.append(characters.get(j));
            }
        }

        return sb.toString();
    }
}