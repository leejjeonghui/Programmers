import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> solution(int[] strArr) {
        Arrays.sort(strArr);
        ArrayList<Integer> arr = new ArrayList<>(5);
        for(int i=0; i<5 ; i++){
            arr.add(strArr[i]);
        }
        return arr;
    }
}