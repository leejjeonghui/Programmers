import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (; l<=r; l++) {
            String value = String.valueOf(l);
            boolean isNotZeroOrFive = false;
            for (int i=0; i<value.length(); i++) {
                char c = value.charAt(i);
                if (!(c == '0' || c == '5')) {
                    isNotZeroOrFive = true;
                    break;
                }
            }
            if (!isNotZeroOrFive) {
                list.add(l);
            }
        }
        answer = list.stream()
                .filter(i -> i != null)
                .mapToInt(i -> i)
                .toArray();
        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            return answer;
        }
    }
}