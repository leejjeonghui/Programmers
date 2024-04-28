import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public ArrayList solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList arr= new ArrayList();
        for(int i =0; i<answer.length;i++){
            if(!answer[i].isEmpty()) {
                arr.add(answer[i]);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}