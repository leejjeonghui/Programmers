public class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i=0;i<my_string.length();i++){
            c = my_string.charAt(i);
            sb.append(c);
        }
        for(int j =0; j<overwrite_string.length();j++){
            sb.setCharAt(s,overwrite_string.charAt(j));
            s++;
        }
        answer = sb.toString();
        System.out.println(answer);
        return  answer;
    }
}

