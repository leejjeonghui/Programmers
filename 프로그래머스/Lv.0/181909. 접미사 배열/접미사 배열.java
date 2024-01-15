import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String my_string) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i =0; i <my_string.length();i++){
            arr.add(my_string.substring(i,my_string.length()));
        }
        Collections.sort(arr);
        return arr;
    }
}