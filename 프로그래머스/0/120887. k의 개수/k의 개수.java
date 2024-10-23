import java.util.*;
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j ; l++) {
            String str =String.valueOf(l);

            if (str.contains(String.valueOf(k))){
                String[] temp = str.split("");
                answer += (int) Arrays.stream(temp).filter(s->s.equals(String.valueOf(k))).count();
            }
        }
        return answer;
    }

}