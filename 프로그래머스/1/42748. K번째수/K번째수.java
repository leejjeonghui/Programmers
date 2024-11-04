import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            int fir = commands[i][0];
            int se = commands[i][1];
            int k = commands[i][2];
            for (int j = fir-1; j <se; j++) {
               temp.add(array[j]);
               Collections.sort(temp);
            }
           answer.add(temp.get(k-1));
           temp.clear();
        }
        return answer;
    }
}