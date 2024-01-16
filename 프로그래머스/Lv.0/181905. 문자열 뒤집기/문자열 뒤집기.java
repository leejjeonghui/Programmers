import java.util.Arrays;
class Solution {
    public StringBuilder solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        char arr[] = my_string.toCharArray();
        StringBuilder sb = new StringBuilder(my_string.substring(s,e+1));
        String revers = String.valueOf(sb.reverse());
        for(int i = 0; s<e+1 ; i++){
            arr[s++] = revers.charAt(i);
        }
        answer.append(arr);
        return answer;
    }
}