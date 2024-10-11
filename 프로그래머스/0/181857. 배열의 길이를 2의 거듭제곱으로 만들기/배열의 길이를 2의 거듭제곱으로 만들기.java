import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int pow = 0;
        for (int i =0; arr.length> pow; i++) {
            pow = (int) Math.pow(2,i);
        }
        return Arrays.copyOf(arr,pow);
    }
}
