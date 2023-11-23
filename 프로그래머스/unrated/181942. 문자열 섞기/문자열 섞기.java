public class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char c;
        char d;
        for(int i=0;i<str1.length();i++){
            c =str1.charAt(i);
            sb.append(c);
            d=str2.charAt(i);
            sb.append(d);
        }
        answer = sb.toString();
        System.out.println(answer);
        return  answer;
    }

}