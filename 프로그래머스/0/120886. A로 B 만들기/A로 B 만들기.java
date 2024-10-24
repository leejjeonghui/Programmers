import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] beforeArr= before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        for (int i = 0; i < afterArr.length; i++) {
            if(beforeArr[i]!=afterArr[i]){
                answer =0;
            }
        }

        return answer;
    }
}